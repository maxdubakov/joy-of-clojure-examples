(ns book-examples.2_chapter.interop
  (:import (java.awt Point)
           (java.util HashMap Date)))

"Accessing static class members in Java"
(println (Math/sqrt 9))
(println (new Point 0 1))

"Dot after class name signifies constructor call"
(println (HashMap. {"Foo" 42, "Put" 21, "Hey" "A"}))



"To access public fields use .- operator"
(println (.-x (Point. 10 20)))

"To access public methods use . operator"
(println (.divide (BigDecimal. "42") 2M)) ; works with 2M only

(let [origin (Point. 0 0)]
  (println (str origin))
  (set! (.-x origin) 15)
  (println (str origin))
  )


"Chaining Java methods"
(println (.endsWith (.toString (Date.)) "2021"))
(println (.. (Date.) toString (endsWith "2021")))


"Calling set of mutators"
(println (doto (HashMap.)
  (.put "HOME" "/home")
  (.put "BIN" "/classes")
  (.put "SRC" "/src")))