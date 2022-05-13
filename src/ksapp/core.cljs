(ns ksapp.core
  (:require [reagent.core :as r]
            [reagent.react-native :as rn]))

(defn hello []
  [rn/view {:style {:flex 1 :align-items "center" :justify-content "center"}}
   [rn/text {:style {:font-size 50}} "Krell has arrived!"]])

(defn ^:export -main [& args]
  (r/as-element [hello]))
