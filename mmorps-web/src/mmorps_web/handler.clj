(ns mmorps-web.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defn createGame [] "TODO")

(defroutes app-routes
  (GET "/hello" [] "Hello World")
  (POST "/game" [] (createGame))
  (route/files "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))

