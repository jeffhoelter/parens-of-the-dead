(ns undead.client)

(def game {:board [{:face :h1} {:face :h1} {:face :h2} {:face :h2}
                    {:face :h3} {:face :h3} {:face :h4} {:face :h4}
                    {:face :h5} {:face :h5} {:face :fg} {:face :fg}
                    {:face :zo} {:face :zo} {:face :zo} {:face :gy}]
           :sand (repeat 30 :remaining)
           :foggy false})
