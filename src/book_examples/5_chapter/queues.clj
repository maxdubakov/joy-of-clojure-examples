(ns book-examples.5-chapter.queues
  (:import (clojure.lang PersistentQueue)))

"OVERRIDE PRINTING METHOD FOR QUEUE"
(defmethod print-method PersistentQueue
  [q, w]
  (print-method '<- w)
  (print-method (seq q) w)
  (print-method '-< w))

"POPULATING QUEUE"
(def schedule
  (conj PersistentQueue/EMPTY :wake-up :shower :brush-teeth))

"INTERACTION"
(println schedule)
(println (peek schedule))
(println (pop schedule))
