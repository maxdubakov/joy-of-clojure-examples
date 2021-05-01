(ns book-examples.2_chapter.scalars.string-like)

(defn symbols
  []
  (def my-pi 22/7)
  (println "my-pi is a symbol with value:" my-pi)
  )

(defn keywords
  []
  (println :chumby)
  (println :2)
  (println :?)
  )

(defn strings
  []
  (println "This is a string")
  (println "This is also\na string")
  (println "This is also
            a string")
  )

(defn characters
  []
  (println "chars represented as Java Character class\nand start with a \\\n")
  (println \u30DE)
  )

(symbols)
(keywords)
(strings)
(characters)
