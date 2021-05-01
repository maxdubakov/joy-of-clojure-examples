(ns book-examples.2_chapter.locals-loops-blocks.loops)

; 'recur' is used to recursively call the same function
(defn print-down-from
  [x]
  (when (pos? x)
    (println x)
    (recur (dec x))
    ))

(defn sum-x
  [sum x]
  (if (pos? x)
    (recur (+ sum x) (dec x))
    sum))

(print-down-from 3)
(println "Sum 'recur':" (sum-x 0 10))

"Use 'when' if:
1. No else part is needed
2. Implicit do is required (the same as let) to perform side-effects
"


(defn sum-down-loop
  [init-x]
  (loop [sum 0, x init-x]
    (if (pos? x)
      (recur (+ sum x) (dec x))
      sum)))

(println "Sum 'loop':" (sum-down-loop 10))