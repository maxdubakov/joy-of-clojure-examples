(ns book-examples.5-chapter.pos)

(defn index [coll]
  (cond
    (map? coll) (seq coll)
    (set? coll) (map vector coll coll)
    :else (map vector (iterate inc 0) coll)))

(defn pos [pred coll]
  (for [[i, v] (index coll) :when (pred v)] i))

(println (pos #{7} [2 3 6 7 7]))
