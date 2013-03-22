(ns mmorps-web.test.handler
  (:use clojure.test
        midje.sweet
        ring.mock.request
        mmorps-web.handler)
  (:require [mmorps-web.controller :as controller]))

(deftest test-app
  (testing "main route"
    (let [response (app (request :get "/hello"))]
      (is (= (:status response) 200))
      (is (= (:body response) "Hello World"))))
  
  (testing "not-found route"
    (let [response (app (request :get "/invalid"))]
      (is (= (:status response) 404)))))

(fact "POSTing to /game calls create-game"
  (app (request :post "/game")) => irrelevant
  (provided
    (controller/create-game-links anything) => {:status irrelevant}))

