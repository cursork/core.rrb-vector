(defproject org.clojure/core.rrb-vector "0.0.12-SNAPSHOT"
  :description "RRB-Trees for Clojure(Script) -- see Bagwell & Rompf"
  :url "https://github.com/clojure/core.rrb-vector"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.2.0"
  :parent [org.clojure/pom.contrib "0.1.2"]
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :source-paths ["src/main/clojure"
                 "src/main/cljs"]
  :test-paths ["src/test/clojure"]
  :global-vars {#_#_*warn-on-reflection* true}
  :jvm-opts ^:replace ["-XX:-OmitStackTraceInFastThrow"]
  :profiles {:dev {:test-paths ["src/test_local/clojure"]
                   :dependencies [[org.clojure/clojurescript "0.0-3058"]
                                  [collection-check "0.1.3"]
                                  [figwheel "0.2.2-SNAPSHOT"]]
                   :plugins [[lein-cljsbuild "1.0.3"]
                             [lein-figwheel  "0.2.2-SNAPSHOT"]]}
             :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}}
  :cljsbuild {:builds {:dev {:source-paths ["src/main/cljs"
                                            "src/test/cljs"]
                             :compiler {:optimizations :none
                                        :output-dir "resources/public/js"
                                        :output-to "resources/public/js/dev.js"}}
                       :test {:source-paths ["src/main/cljs"
                                             "src/test/cljs"]
                              :compiler {:optimizations :advanced
                                         :output-to "out/test.js"}}}})
