(ns book-examples.2_chapter.collections)

(defn lists
  []
  (println "Everything that is in () is a list")
  (println "The first argument is evaluated to:\n1. function\n2. macro\n3. special operator")
  (println "List example (read in code):" (+ 2 3 4))
  )

(defn vectors
  []
  (println "\n[1 2 3] is a vector\nHere, we do not evaluate first element\nto 1 of 3 as in a list")
  (println [1 2 3])
  )

(defn maps
  []
  (println "\n{1: \"one\", 2: \"two\"} is a map")
  (println {1 "one", 2 "two", 3 "three"})
  )

(defn sets
  []
  (println "\n#{1 :hey \"hello\"} is a set")
  (println #{1 2 :? 'OhMy})
  )

(lists)
(vectors)
(maps)
(sets)
(println "\nEmpty collection isn't the same as" nil)
