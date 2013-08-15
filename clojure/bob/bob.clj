(ns bob
  (:use [clojure.string :only [blank? upper-case]] ))

(defn- shouting? [message]
  (= (upper-case message) message))

(defn- asking? [message]
  (= (last message) \?))

(defn- silent? [message]
  (blank? message))

(defn response-for [message]
  (cond
   (silent? message)   "Fine, be that way."
   (shouting? message) "Woah, chill out!"
   (asking? message)   "Sure."
   :else               "Whatever."))