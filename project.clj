(defproject parens-of-the-dead "0.0.1-SNAPSHOT"
  :description "A series of zombie-themed games written in Clojure and ClojureScript."
  :url "http://www.parens-of-the-dead.com"
  :license {:name "GNU General Public License"
            :url "http://www.gnu.org"}
  :jvm-opts ["-XX:MaxPermSize=265m"]
  :main undead.system
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [http-kit "2.1.18"]
                 [com.stuartsierra/component "0.2.3"]
                 [reloaded.repl "0.1.0"]]
  :profiles {:dev {:plugins []
                   :dependencies []
                   :source-paths ["dev"]}})
