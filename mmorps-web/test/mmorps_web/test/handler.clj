(ns mmorps-web.test.handler
  (:use clojure.test
        midje.sweet
        ring.mock.request  
        mmorps-web.handler))

(deftest test-app
  (testing "main route"
    (let [response (app (request :get "/hello"))]
      (is (= (:status response) 200))
      (is (= (:body response) "Hello World"))))
  
  (testing "not-found route"
    (let [response (app (request :get "/invalid"))]
      (is (= (:status response) 404)))))

(fact "POSTing to /game calls createGame"
  (app (request :post "/game")) => irrelevant
  (provided
    (createGame anything) => {:status irrelevant}))

(comment (fact 
    (createGame {}))) 
