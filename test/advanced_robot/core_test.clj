(ns advanced-robot.core-test
  (:require [clojure.test :refer :all]
            [advanced-robot.core :refer :all]))

(deftest a-test
  (testing "board of size 1"
    (is (true? (solve 1 [0 0] []))))

  (testing "board of size 2 with no black cells"
    (is (true? (solve 2 [0 0] []))))

  (testing "board of size 2 with one black cells"
    (is (true? (solve 2
                      [0 0]
                      [[1 1]]))))

  (testing "board of size 3 that is not traversable"
    (is (false? (solve 3
                       [0 0]
                       [[1 1] [0 2] [2 0]]))))

  (testing "board of size 3 that is traversable"
    (is (true? (solve 3
                      [0 0]
                      [[1 1]
                       [2 0]]))))

  (testing "board of size 4 that is not traversable"
    (is (false? (solve 4
                       [1 2]
                       [[1 3]
                        [2 2]
                        [3 2]]))))

  (testing "board of size 4 that is traversable"
    (is (true? (solve 4
                      [1 2]
                      [[1 3]
                       [2 2]
                       [3 2]
                       [2 3]
                       [3 3]]))))

  (testing "board of size 4 that is traversable"
    (is (true? (solve 4
                      [1 2]
                      [[1 3]
                       [2 2]])))))
