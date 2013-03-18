(ns mmorps-web.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
	    [ring.middleware.json :as json]))

(defn createGame [request] (println request) (:players (:body request)))

(defroutes app-routes
  (GET "/hello" [] "Hello World")
  (POST "/game" [] createGame)
  (route/files "/")
  (route/not-found "Not Found"))

(def app
  (handler/site (json/wrap-json-body app-routes {:keywords? true})))

