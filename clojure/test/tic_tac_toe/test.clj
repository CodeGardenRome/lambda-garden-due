(ns tic-tac-toe.test
  (:require  [clojure.test :refer :all]
             [tic-tac-toe.lib :refer :all]))

(def game [[:e :o :x]
           [:e :x :o]
           [:x :e :e]])

(deftest check-line-test
  (is (= :false (check-line (nth game 0)))))
