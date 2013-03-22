(ns mmorps-web.test.controller
  (:use midje.sweet
        [mmorps-web.controller :only (create-game-links)])
  (:require [mmorps.core :as core]))

(defn- url? [x]
  (not (nil? (re-matches #"^http[s]?://.*$" x)))) 

(fact
  (create-game-links {:body {:players 2}}) => #(every? url? %))

(fact
  (create-game-links {:body {:players 3}}) => anything
  (provided
    (core/create-game-ids 3) => ["a" "b" "c"]))

