(ns mikera.cljutils.test-arrays
  (:use clojure.test)
  (:use [mikera.cljutils arrays]))

(deftest test-types-array
  (is (typed-array [1 2 3])))

(deftest test-array?
  (is (array? (int-array [1 2 3])))
  (is (array? (object-array [1 2 3])))
  (is (not (array? :foo))))

(deftest test-array-type
  (is (identical? Integer/TYPE (array-type (int-array [1 2 3]))))
  (is (identical? Object (array-type (object-array [1 2 3]))))
  (is (nil? (array-type :foo))))


