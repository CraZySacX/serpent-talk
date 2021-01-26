(ns serpent-talk.talk-test
  (:require [clojure.test :refer :all])
  (:require [serpent_talk.talk]))

(deftest say-hello-test
  (is (= "blah_de_blah" (serpent_talk.talk/say-hello "blah de blah")))
  (is (= "blah_de_blah" (serpent_talk.talk/say-hello "blah-de-blah")))
  (is (= "blah_de_blah" (serpent_talk.talk/say-hello "blah De blah"))))
