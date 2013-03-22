(ns mmorps-web.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.middleware.json :as json]
            [mmorps-web.controller :as controller]))

(defroutes app-routes
  (GET "/hello" [] "Hello World")
  (POST "/game" [] controller/create-game-links)
  (route/files "/")
  (route/not-found "Not Found"))

(def app
  (handler/site (json/wrap-json-body app-routes {:keywords? true})))

