(ns dna
  (:use [clojure.string :only [replace] ]))

(def thymine \T)
(def uracil \U)

(defn to-rna [strand]
  (replace strand thymine uracil))