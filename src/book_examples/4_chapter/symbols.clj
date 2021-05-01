(ns book-examples.4-chapter.symbols)


(println (identical? 'sym 'sym))
(println (= 'g 'g))
"SYMBOLS WITH THE SAME NAME ARE NOT THE SAME OBJECT"


"METADATA -- I can attach and fetch metadata to any object in Clojure"
(println (let [x (with-meta 'goat {:ornery true})
      y (with-meta 'goat {:ornery false})]
  [(= x y)
   (identical? x y)
   (meta x)
   (meta y)]))
