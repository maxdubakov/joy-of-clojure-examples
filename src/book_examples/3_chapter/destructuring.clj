(ns book-examples.3_chapter.destructuring)

(def guys-whole-name ["Max", "KROVOSISYA", "Dubakov"])

"WITHOUT DESTRUCTURING"
(prn (str (nth guys-whole-name 2) ", "
     (nth guys-whole-name 0) " "
     (nth guys-whole-name 1)))



"WITH POSITIONAL DESTRUCTURING"
(prn (let [[f-name m-name l-name] guys-whole-name]
       (str l-name ", " f-name " " m-name)))

(def date-regex #"(\d{1,2})\/(\d{1,2})\/(\d{4})")
(prn (let [rem (re-matcher date-regex "12/02/1975")]
  (when (.find rem)
    (let [[_ m d] rem]
      {:month m :day d}))))

(let [[a b c & more] (range 10)]
  (prn "a b c are:" a b c)
  (prn "more: " more)
  )

(let [range-vec (vec (range 10))
      [a b c & more :as all] range-vec]
  (prn "a b c are:" a b c)
  (prn "more:" more)
  (prn "all:" all)
  )


"DESTRUCTURING WITH A MAP"
(def guys-name-map
  {:f-name "Guy" :m-name "Lewis" :l-name "Steele"})


(let [{f-name :f-name, m-name :m-name, l-name :l-name} guys-name-map]
  (prn (str l-name ", " f-name " " m-name)))

(let [{:keys [f-name m-name l-name]} guys-name-map]
  (prn (str l-name ", " f-name " " m-name)))

; the same as :keys but looking for strings in keys of input map
(let [{:strs [f-name m-name l-name]} guys-name-map]
  (prn (str l-name ", " f-name " " m-name)))

; the same as :keys but looking for symbols in keys of input map
(let [{:syms [f-name m-name l-name]} guys-name-map]
  (prn (str l-name ", " f-name " " m-name)))

(let [{f-name :f-name, :as whole-name} guys-name-map]
  (println "First name:" f-name)
  (println "The whole name:" whole-name)
  )

(let [{:keys [title f-name m-name l-name], :or {title "Mr."}} guys-name-map]
  (println title l-name f-name m-name)
  )

"MAP DESTRUCTURING CAN HAPPEN WITH LISTS AS WELL:
THEY WILL BE CASTED TO MAP AND ONLY THEN, DESTRUCTURED"
(defn whole-name [& args]
  (let [{:keys [f-name m-name l-name]} args]
    (str l-name ", " f-name " " m-name)))

(println (whole-name :f-name "Guy" :m-name "Lewis" :l-name "Steele"))


"DESTRUCTURING IN FUNCTIONS IS THE SAME AS IN LET"
(defn print-last-name
  [{:keys [l-name]}]
  (println l-name)
  )

(print-last-name guys-name-map)
