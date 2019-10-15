(ns advanced-robot.core
  (:gen-class))

;given a position, return the list of valid co-ords that a robot can move to
(defn valid-moves [width [x y]]
  (filter identity
          [(when (< (inc y) width)
             [x (inc y)])
           (when (< 0 y)
             [x (dec y)])
           (when (< 0 x)
             [(dec x) y])
           (when (< (inc x) width)
             [(inc x) y])]))

; emit all co-ords in a board
(defn all-cells [width]
  (for [x (range width)
        y (range width)]
    [x y]))

(defn traverse [width robot black-cells visited]
  (reduce (fn [visited robot]
            (if (some #(= robot %) visited) ; do not revisit cells
              visited
              (traverse width robot black-cells (conj visited robot)))) ; as we perform the depth first search add to the list of visited cells
          visited
          (remove (set black-cells) (valid-moves width robot)))) ; iterate the list of valid moves from the current position

(defn solve [width robot black-cells]
  (= (sort (traverse width robot black-cells [robot]))
     (remove (set black-cells) (all-cells width))))
