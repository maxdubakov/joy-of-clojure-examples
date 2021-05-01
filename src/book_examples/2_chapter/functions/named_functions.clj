(ns book-examples.2_chapter.functions.named-functions)

; Since function is a first-class, we can treat them as data, vars
; and so on:
(def make-set
  (fn [x y]
    (println "Making a set...")
    #{x y}
    ))
(println (make-set 1 2))


(defn make-set-defn
  "This is a named function that makes a set"
  [x y]
  (println "Making a set....")
  #{x y})
(println (make-set-defn 1 2))

; This way I can pass a certain number of parameters.
; Function will work differently for different # of params
(defn make-set-arity
  ([x] #{x})
  ([x y] #{x y})
  ([x y z] #{x y z}))
(println (make-set-arity 1 4 5))


; Unlimited # of arguments (at least 1)
(defn make-set-arity1+
  [first & args]
  (vector first args)
  )
(println (make-set-arity1+ 1))
(println (make-set-arity1+ 1 2 3 4))


; Unlimited # of arguments, even 0 is ok
(defn make-set-arity+
  [& args]
  (vector args)
  )
(println (make-set-arity+))
(println (make-set-arity+ 1))
(println (make-set-arity+ 1 2 3 4))
