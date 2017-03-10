(ns undead.system
  (:require [org.httpkit.server :refer [run-server]]
            [com.stuartsierra.component :as component]))

(defn app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "hello HTTP!"})


(defn- start-server [handler port]
  (run-server app {:port port})
  (println (str "Started server on localhost:" port))
  server)

(defn- stop-server [server]
  (when server
    (server))) ;; run-server returns a fn that stops itself

(defrecord ParensOfTheDead []
  component/Lifecycle
  (start [this]
    (assoc this :server (start-server #'app 9009)))
  (stop [this]
    (stop-server (:server this))
    (dissoc this :server)))


(defn create-system []
  (ParensOfTheDead.))

(defn -main [& args]
  (.start (create-system)))
