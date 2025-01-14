(ns examples.mafs.edit
  {:nextjournal.clerk/visibility {:code :hide}
   :nextjournal.clerk/doc-css-class [:overflow-hidden :p-0]}
  (:require [nextjournal.clerk :as clerk]))


(clerk/with-viewer
  {:render-fn 'nextjournal.clerk.render.editor/view
   :transform-fn clerk/mark-presented}
  (slurp "dev/examples/mafs.clj"))
