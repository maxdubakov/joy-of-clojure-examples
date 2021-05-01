(ns book-examples.2_chapter.quoting)

"Quoting is used to treat some data as a literal and do not evaluate it"
;(cons 1 (2 3)); -- WILL NOT COMPILE
(println (cons 1 (quote (2 3)))) ; -- OK
(println (cons 1 '(2 3)))

(println '(1 (+ 2 3))) ; QUOTING AFFECTS SUB-FORMS AS WELL

"SYNTAX QUOTE always qualifies internal forms"
(println `(4 (+ 2 3)))
(println `(map even? [1 2 3]))
(println `non-existing-function)


"UNQOUTING (~ symbol is used)"

(println `(+ 10 (* 3 2)))
(println `(+ 10 ~(* 3 2)))

(println `(1 ~'(2 3)))
; => (1 (2 3))

(println `(1 ~@'(2 3)))
; => (1 2 3)
