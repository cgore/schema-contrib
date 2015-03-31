(defproject cgore/schema-contrib "0.1.6"
  :description "Additional validators for Prismatic's Schema."
  :url "https://github.com/cgore/schema-contrib"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[instaparse "1.3.0"]
                 [org.clojure/clojure "1.6.0"]
                 [org.clojure/test.check "0.5.7"]
                 [prismatic/schema "0.2.6"]]
  :resource-paths ["resources"])
