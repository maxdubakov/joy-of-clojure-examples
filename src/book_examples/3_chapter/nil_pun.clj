(ns book-examples.3_chapter.nil-pun)

"Empty collections are evaluated to 'true', but (seq []) is nil"
(println (seq [1 2 3]))
(println (seq []))

(defn print-seq
  [s]
  (when (seq s)
    (prn (first s))
    (recur (rest s))
    ))

(print-seq [1 2 3])
