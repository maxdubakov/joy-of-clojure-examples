(ns book-examples.2_chapter.scalars.numbers)

(defn integers
  []
  (def too-big-int 991778647261948849222819828311491035886734385827028118707676848307166514)
  ; N at the end notates that it is stored as BitInt in JVM
  (println too-big-int)

  (def representation-of-ints [127 0x7F 0177 32r3V 2r01111111])
  (println "ints:" representation-of-ints)
  )

(defn floating-point
  []
  (def points [1.17 +1.22 -2. 366e7 32e-14 -10.7e-3])
  (println "floating point:" points)
  )

(defn rationals
  []
  (def ration [22/7 -7/22 1028798300297636767687409028872/88829897008789478784 -103/4])
  (println "rational:" ration)
  )

(integers)
(floating-point)
(rationals)
