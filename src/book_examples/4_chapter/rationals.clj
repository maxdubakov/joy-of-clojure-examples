(ns book-examples.4-chapter.rationals)

"WRONG WAY TO BE PRECISE"
(def a 1.0e50)
(def b -1.0e50)
(def c 17.0e00)

(println (+ (+ a b) c))
(println (+ a (+ b c)))


"USING RATIONAL"
(def a (rationalize 1.0e50))
(def b (rationalize -1.0e50))
(def c (rationalize 17.0e00))

(println (+ (+ a b) c))
(println (+ a (+ b c)))

(println (numerator (/ 123 456))) ; => 41
(println (denominator (/ 123 456))) ; => 152 (we were able to cancel)

"however, calculating rationals is speed-consuming"
