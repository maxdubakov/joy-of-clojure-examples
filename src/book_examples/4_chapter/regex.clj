(ns book-examples.4-chapter.regex
  (:import (java.util.regex Pattern)))

(println (Pattern/compile "\\d+"))

(println (re-seq #"\w+" "one-two/three"))
(println (re-seq #"\w*(\w)" "one-two/three"))
