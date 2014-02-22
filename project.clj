(defproject lein-cljsbuild-practice "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://github.com/kaosf/clojure-lein-cljsbuild-practice"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2173"]]
  :plugins [[lein-cljsbuild "1.0.2"]]
  :cljsbuild {
    :builds [{
      ; The path to the top-level ClojureScript source directory:
      :source-paths ["src-cljs"]
      ; The standard ClojureScript compiler options:
      ; (See the ClojureScript compiler documentation for details.)
      :compiler {
        :output-to "war/javascripts/main.js"  ; default: target/cljsbuild-main.js
        :optimizations :whitespace
        :pretty-print true}}]})
