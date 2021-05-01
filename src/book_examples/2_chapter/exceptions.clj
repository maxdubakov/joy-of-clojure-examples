(ns book-examples.2_chapter.exceptions)

(defn try-catch
  [f]
  (try
    (f)
    (catch ArithmeticException e "No division by zero!")
    (catch Exception e (str "You are so bad " (.getMessage e)))
    (finally (println "returning..."))
    )
  )

(println (try-catch #(/ 20 5)))
(println (try-catch #(/ 20 0)))
(println (try-catch #(throw (Exception. "Crybaby"))))
