(ns book-examples.2_chapter.functions.anonymous-functions)

(fn [x y]
  (println "Making a set...")
  #{x y}
  )

(println ((fn [x y]
   (println "Making a set...")
   #{x y})
          1 2))

; Replacement of fn is #() -- just shorter version
(def make-list0 #(list))
(println (make-list0))

(def make-list2 #(list %1 %2))
(println (make-list2 1 3))

(def make-list-2+ #(list %1 %2 %&))
(println (make-list-2+ 1 2 101 902))
