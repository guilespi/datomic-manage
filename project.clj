(defproject com.intception/datomic-manage "0.1.0"
  :description "Datomic migrations manager"
  :url "https://github.com/guilespi/datomic-manage"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.datomic/datomic-pro "0.9.4815.12" :exclusions [org.slf4j/slf4j-nop org.slf4j/log4j-over-slf4j]]])
