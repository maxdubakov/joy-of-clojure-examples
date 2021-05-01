(ns book-examples.3_chapter.truthiness)

(println (if true :truthy :falsey)) ; => :truthy
(println (if [] :truthy :falsey)) ; => :truthy
(println (if nil :truthy :falsey)) ; => :falsey
(println (if false :truthy :falsey)) ; => :falsey


(def evil-false (Boolean. "false")) ; NEVER do this

(println evil-false) ; => :false
(println (= false evil-false)) ; => true
"!!! BUT !!!"
(println (if evil-false :truthy :falsey)) ; => :truthy

"It you want to parse a string use"
(println (if (Boolean/valueOf "false") :truthy :falsey)) ; => :falsey


"There is also nil? and false? functions"
(println (when (nil? nil) "Actually nil, not false"))