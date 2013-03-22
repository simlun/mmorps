(ns mmorps-web.controller
  (:require [mmorps.core :as core]))

(defn create-game-links [request]
  (let [players (:players (:body request))]
    (core/create-game-ids players)
    (map (fn [_] "http://") (range 0 players))))

