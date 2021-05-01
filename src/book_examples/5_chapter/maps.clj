(ns book-examples.5-chapter.maps)

"------------------------- HASH MAP ------------------------------"
(def my-hash-map (hash-map :a 1, :b 2, :c 3, :d 4, :e 5))

(println my-hash-map)

"GET ELEMENT BY KEY"
(let [m {:a 1, 1 :b, [1 2 3] "4 5 6"}]
  [(println (get m :a) "," (get m [1 2 3]))])

"ANOTHER GET BY KEY"
(let [m {:a 1, 1 :b, [1 2 3] "4 5 6"}]
  [(println (m :a) "," (m [1 2 3]))])

"RETURNS SEQUENCE OF MAP ENTRIES"
(println (seq my-hash-map))


"CREATE A MAP USING VECTORS"
(println (into {} [[:a 1] [:b 2]]))

"CREATE A MAP USING ANY OTHER TYPE"
(println (into {} (map vec '[(:a 1) (:b 2)])))

"CREATE USING APPLY"
(println (apply hash-map [:a 1 :b 2]))

"ZIPMAP: FIRST VECTOR - KEYS; SECOND - VALUES"
(println (zipmap [:a :b] [1 2]))


"------------------------- SORTED MAP ----------------------------"

(def my-sorted-map (sorted-map :you 1 :thx 2))

(println my-sorted-map)

"MY OWN COMPARATOR"
(println (sorted-map-by #(compare (subs %1 1) (subs %2 1)) "bac" 2 "abc" 9))


"PICK SUBSEQUENCE KNOWING PART OF KEY; KNOWING IT SHOULD BE SMALLER THAN ..."
(println (subseq (sorted-map :a 1 :t 2 :z 3) < :x))


"SORTED MAP TREATS THE SAME 1.0 AND 1 I.E."
(println (assoc (sorted-map 1 :int) 1.0 :float))

"------------------------- ARRAY MAP -----------------------------"
"USED IF INSERTION ORDERING IS IMPORTANT"
(println(seq (array-map :a 1, :b 2, :c 3)))