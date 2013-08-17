(ns phrase (:use [clojure.string :as str]))

(defn- normalize-words [phrase] (->> phrase (re-seq #"\w+")))

(defn word-count [phrase] (->> phrase str/lower-case normalize-words frequencies))