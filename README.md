```
margus.sipria:~/Documents/workspace/sbt-bug (master)$ sbt
[info] Loading global plugins from /Users/margus.sipria/.sbt/0.13/plugins
[info] Loading project definition from /Users/margus.sipria/Documents/workspace/sbt-bug/project
[info] Set current project to sbt-bug (in build file:/Users/margus.sipria/Documents/workspace/sbt-bug/)
> compile
[info] Updating {file:/Users/margus.sipria/Documents/workspace/sbt-bug/}sbt-bug...
[info] Resolving org.fusesource.jansi#jansi;1.4 ...
[warn] 	[FAILED     ] javax.ws.rs#javax.ws.rs-api;2.1!javax.ws.rs-api.${packaging.type}:  (0ms)
[warn] ==== local: tried
[warn]   /Users/margus.sipria/.ivy2/local/javax.ws.rs/javax.ws.rs-api/2.1/${packaging.type}s/javax.ws.rs-api.${packaging.type}
[warn] ==== public: tried
[warn]   https://repo1.maven.org/maven2/javax/ws/rs/javax.ws.rs-api/2.1/javax.ws.rs-api-2.1.${packaging.type}
[warn] ==== local-preloaded-ivy: tried
[warn]   /Users/margus.sipria/.sbt/preloaded/javax.ws.rs/javax.ws.rs-api/2.1/${packaging.type}s/javax.ws.rs-api.${packaging.type}
[warn] ==== local-preloaded: tried
[warn]   file:////Users/margus.sipria/.sbt/preloaded/javax/ws/rs/javax.ws.rs-api/2.1/javax.ws.rs-api-2.1.${packaging.type}
[warn] 	::::::::::::::::::::::::::::::::::::::::::::::
[warn] 	::              FAILED DOWNLOADS            ::
[warn] 	:: ^ see resolution messages for details  ^ ::
[warn] 	::::::::::::::::::::::::::::::::::::::::::::::
[warn] 	:: javax.ws.rs#javax.ws.rs-api;2.1!javax.ws.rs-api.${packaging.type}
[warn] 	::::::::::::::::::::::::::::::::::::::::::::::
[trace] Stack trace suppressed: run last *:update for the full output.
[error] (*:update) sbt.ResolveException: download failed: javax.ws.rs#javax.ws.rs-api;2.1!javax.ws.rs-api.${packaging.type}
[error] Total time: 1 s, completed Mar 9, 2018 12:41:39 PM
```
