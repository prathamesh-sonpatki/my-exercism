(ns anagram)

(declare sort-word remove-identical-words)

(defn anagrams-for [word, list]
  (filter (fn [w] (= (sort-word w) (sort-word word))) (remove-identical-words word list)))

(defn- sort-word [word] (-> (sort word) clojure.string/join))

(defn- remove-identical-words [word, list] (remove (fn [w] (= w word)) list))