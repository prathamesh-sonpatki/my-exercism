(ns phrase
  (:use [clojure.string :as str]))

(defn- current-count [map word] (get map word 0))

(defn- prepare-count-word-hash [map word]
  (assoc map word (inc (current-count map word))))

(defn- downcased-phrase [phrase] (str/lower-case phrase))

(defn- normalize-words [phrase]
  (re-seq #"\w+" (downcased-phrase phrase)))

(defn word-count [phrase]
  (reduce prepare-count-word-hash {} (normalize-words phrase)))