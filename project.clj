(defproject advanced-robot "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot advanced-robot.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
