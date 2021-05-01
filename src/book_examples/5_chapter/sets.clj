(ns book-examples.5-chapter.sets
  (:require clojure.set))

(def my-set #{:a 1 :b 2})

"USED TO FIND ELEMENT :z"
(println (some #{:z} my-set))

(def my-sorted-set (sorted-set :a :c :b))

"WILL NOT COMPILE: TYPES ARE NOT THE SAME"
; (def my-sorted-set (sorted-set 1 :c :b))

(println my-sorted-set)


"CONTAINS WORKS FOR SETS AND MAPS, BUT NOT FOR VECTORS"
"BECAUSE IT SEARCHES FOR KEY WITH REQUIRED VALUE (SETS ARE IMPLEMENTED AS MAPS)"
(println (contains? my-set :a))
(println (contains? my-set :none))

"INTERSECTION"
(println (clojure.set/intersection #{:pez :gum :dots :skor}
                                   #{:pez :skor :pocky}
                                   #{:pocky :gum :skor}))

"UNION"
(println (clojure.set/union #{:pez :gum :dots :skor}
                            #{:pez :skor :pocky}
                            #{:pocky :gum :skor}))

"DIFFERENCE"
(println (clojure.set/difference #{1 2 3 4} #{3 4 5 6}))