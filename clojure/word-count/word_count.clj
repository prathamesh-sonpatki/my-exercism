(ns phrase
  (:use [clojure.string :as str]))

(defn- current-count [map word] (get map word 0))

(defn- prepare-count-word-hash [map word]
  (->> (current-count map word) inc (assoc map word)))

(defn- downcased-phrase [phrase] (str/lower-case phrase))

(defn- normalize-words [phrase]
  (->> (downcased-phrase phrase) (re-seq #"\w+")))

(defn long-word-count [phrase]
  (->> (normalize-words phrase) (reduce prepare-count-word-hash {})))

;; another implementation using frequencies
(defn word-count [phrase]
  (frequencies (normalize-words phrase)))