(ns book-examples.2_chapter.namespaces.importing
  (:require [clojure.set :as s])
  (:require [clojure.string :refer (capitalize)])
  (:refer book-examples.second_chapter.collections)
  (:refer clojure.set :rename {union onion})                ; :rename works with :require as well
  (:import (java.awt Point)
           (java.util HashMap)))

(println (s/intersection #{1 2 3} #{3 4 5}))
(println (map capitalize ["i" "am" "the" "king" "of" "shit"]))
(vectors)
(println (onion #{4 5 6} #{6 7 8}))
(println (str (Point. 1 2)))
(println (str (HashMap. {1 "one"})))