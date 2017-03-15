(ns undead.web
  (:require [compojure.core :refer [defroutes]]))

(declare)

(defn app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "hello HTTP!"})

(defroutes app
  (GET ))
