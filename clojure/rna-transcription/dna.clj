(ns dna
  (:use [clojure.string :only [replace]]))

(defn to-rna [strand]
  (replace strand \T \U))