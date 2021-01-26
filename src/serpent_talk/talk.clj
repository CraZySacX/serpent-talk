(ns serpent_talk.talk
  (:require [camel-snake-kebab.core :as csk]))

(defn say-hello [x]
  (csk/->snake_case x))

(defn -main []
  (println (say-hello "hello pigeon"))
  0)