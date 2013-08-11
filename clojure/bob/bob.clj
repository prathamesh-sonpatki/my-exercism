(ns bob)

(defn shouting?
  [message]
  (= (clojure.string/upper-case message) message)
  )

(defn asking?
  [message]
  (.endsWith message "?"))

(defn silent?
  [message]
  (clojure.string/blank? message)
  )

(defn response-for
  [message]
  (cond
   (silent? message)   "Fine, be that way."
   (shouting? message) "Woah, chill out!"
   (asking? message)   "Sure."
   :else               "Whatever."
   ))