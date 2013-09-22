(ns anagram)

(defn anagrams-for
  [word list]
  (filter (fn [w] (= (frequencies w) (frequencies word))) list))
