(ns user
  (:require [integrant.repl :as repl]
            ; [integrant.core :as ig]
            [stel-codes.system :as system]))

(repl/set-prep! (fn [] system/config))

(def go repl/go)
(def halt repl/halt)
(def reset repl/reset)
(def reset-all repl/reset-all)

(comment
  (reset)
  (reset-all))
