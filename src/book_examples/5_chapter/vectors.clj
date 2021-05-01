(ns book-examples.5-chapter.vectors)

"BUILDING VECTORS"
(println (vec (range 10)))

"POURING VALUES"
(println (let [my-vec [:a :b :c]]
            (into my-vec (range 10))))

"TYPED VECTOR"
(println (into (vector-of :int) [Math/PI 2.999 4.1]))

"GET VALUE FROM VECTOR"
(def a-to-j (vec (map char (range 65 75))))
(println a-to-j)

"1"
(println (nth a-to-j 4))

"2"
(println (get a-to-j 4))

"3"
(println (a-to-j 4))

"SEQ OF VECTOR"
(println (seq a-to-j))
(println (rseq a-to-j))

(println (assoc a-to-j 4 "'not E'"))
(println (replace {2 :a 4 :b} [1 2 3 4 5 6 4 4 2 3]))


"2-DIMENSIONAL VECTOR OPERATIONS"
(def matrix [
             [1 2 3]
             [4 5 6]
             [7 8 9]
             ])

(println (get-in matrix [1 2]))
(println (assoc-in matrix [1 2] 'x))
(println (update-in matrix [1 2] * 10))

"EXAMPLE"
(defn neighbors
  ([size yx] (neighbors [[-1 0] [1 0] [0 -1] [0 1]]
                        size yx))
  ([deltas size yx]
   (filter (fn [new-yx]
             (every? #(< -1 % size) new-yx))
           (map #(vec (map + yx %))
                deltas))))

(println (neighbors 3 [0 0]))
(println (neighbors 3 [1 1]))



"VECTOR AS STACK"
(def my-stack [1 2 3])

(println (peek my-stack))

(println (pop my-stack))

(println (conj my-stack 4))

(println (+ (peek my-stack) (peek (pop my-stack))))


"SUB-VECTORS"
(println (subvec a-to-j 3 6))


"VECTORS IN MAP ENTRIES"
(println (vector? (first {:width 10, :height 20, :depth 15})))

(doseq [[dimension amount] {:width 10, :height 20, :depth 15}]
  (println (str (name dimension) ":") amount "inches"))
