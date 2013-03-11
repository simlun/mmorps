(ns mmorps-web.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/hello" [] "Hello World")
  (route/files "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
