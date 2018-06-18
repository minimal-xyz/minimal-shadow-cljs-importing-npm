
(ns app.main
  (:require ["dayjs" :as dayjs]
            ["shortid" :as shortid]
            ["lodash" :as lodash]
            ["lodash" :refer [isString]]))

(defn main! []
  (println "Started!")
  (.log js/console "dayjs" (dayjs))
  (.log js/console "shortid" (.generate shortid))
  (.log js/console "lodash" (isString :a-keyword) (lodash/isObject {})))

(defn reload! []
  (main!)
  (println "Reloaded!"))

(.addEventListener js/window "load" main!)
