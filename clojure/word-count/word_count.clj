(ns phrase (:use [clojure.string :as str]))

(defn- downcased-phrase [phrase] (-> phrase str/lower-case ))

(defn- normalize-words [phrase] (->> (downcased-phrase phrase) (re-seq #"\w+")))

(defn word-count [phrase] (->> phrase normalize-words frequencies ))