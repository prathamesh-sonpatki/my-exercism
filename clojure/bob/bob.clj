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
  (if (silent? message)         "Fine, be that way."
      (if (shouting? message)   "Woah, chill out!"
          (if (asking? message) "Sure."
                                "Whatever."))))