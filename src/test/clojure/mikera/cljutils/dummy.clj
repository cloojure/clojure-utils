(ns mikera.cljutils.dummy
  (:require [mikera.cljutils.namespace :as n])
  (:require [mikera.cljutils.import :as imp]))

(def dummy-bar 
  "dummy-bar in mikera.cljutils.dummy namespace" 9)

(n/from 'mikera.cljutils.import 'clone-foo)

;; (n/import mikera.cljutils.import [import-foo])

(n/import mikera.cljutils.import/import-foo)
(n/pull mikera.cljutils.import [import-bar])
(n/pull mikera.cljutils.import import-func)
(n/pull mikera.cljutils.import/import-macro)

(n/pull-all mikera.cljutils.pulled)

(defn test-stuff []
  (meta #'mikera.cljutils.import/import-foo)
  (meta #'import-foo)
  (meta #'dummy-bar)  ;; gets metadata inluding docstring
)
