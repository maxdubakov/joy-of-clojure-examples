(ns book-examples.2_chapter.locals-loops-blocks.blocks)

; When something needs to be treated as one block, use this:
(do
  (def x 5)
  (def y 4)
  (+ x y)
  [x y] ; return value is a vector
  )

; x and y are still accessible in outer scope
; do blocks are related to side-effectful activities:
;defining a var, printing and so on
(println x)
