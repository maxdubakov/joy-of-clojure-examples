(ns book-examples.4-chapter.keywords)

"USAGES OF KEYWORDS"


"1. MAP KEYS"
(def population {:zombies 2700, :humans 9})

"ISN'T COOL"
(println (/ (get population :zombies)
            (get population :humans))
         "zombies per capita")

"COOL"
(println (/ (:zombies population)
            (:humans population))
         "zombies per capita")


"2. ENUMERATION"

"3. AS DIRECTIVES"
(defn pour [lb ub]
  (cond
    (= ub :inf) (iterate inc lb)
    :shit (range lb ub)))
; shit is evaluated to true, so it will work as 'else' just fine

(println (pour 1 10))
(println (pour 1 20))

