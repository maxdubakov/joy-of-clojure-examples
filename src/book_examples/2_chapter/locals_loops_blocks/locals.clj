(ns book-examples.2_chapter.locals-loops-blocks.locals)

(let [r 5
      pi 3.141592
      r-squared (* r r)]
  (println "Radius is" r)
  (* pi r-squared)
  )

; using let we cannot access its variables in outer scope
; (println r) -- impossible, throws an Exception