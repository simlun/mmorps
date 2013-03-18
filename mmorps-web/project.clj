(defproject mmorps-web "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.5"]
                 [ring/ring-json "0.2.0"]]
  :plugins [[lein-ring "0.8.2"]]
  :ring {:handler mmorps-web.handler/app}
  :profiles {:dev {:dependencies [[ring-mock "0.1.3"]
                                  [midje "1.5.0"]]
                   :plugins [[lein-midje "3.0.0"]]}})

