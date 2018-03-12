```
margus.sipria:~/Documents/workspace/sbt-bug (master)$ sbt
[info] Loading global plugins from /Users/margus.sipria/.sbt/0.13/plugins
[info] Loading project definition from /Users/margus.sipria/Documents/workspace/sbt-bug/project
[info] Set current project to sbt-bug (in build file:/Users/margus.sipria/Documents/workspace/sbt-bug/)
[info] Installing the s3:// URLStreamHandler via java.net.URL.setURLStreamHandlerFactory
[info] Creating a new Ivy URLHandlerDispatcher to handle s3:// URLs
> compile
[info] Updating {file:/Users/margus.sipria/Documents/workspace/sbt-bug/}sbt-bug...
[info] Resolving net.java#jvnet-parent;5 ...
[info] S3URLHandler - Looking up AWS Credentials for bucket: maven.custom ...
[info] S3URLHandler - Using AWS Access Key Id: AKIAAAAAAAAAAAAAAAAA for bucket: maven.custom
[info] S3URLHandler - Created S3 Client for bucket: maven.custom and region: us-west-2
[info] Resolving org.fusesource.jansi#jansi;1.4 ...
[warn] 	::::::::::::::::::::::::::::::::::::::::::::::
[warn] 	::          UNRESOLVED DEPENDENCIES         ::
[warn] 	::::::::::::::::::::::::::::::::::::::::::::::
[warn] 	:: javax.ws.rs#javax.ws.rs-api;2.1: java.net.URISyntaxException: Illegal character in path at index 80: s3://maven.custom/releases/javax/ws/rs/javax.ws.rs-api/2.1/javax.ws.rs-api-2.1.${packaging.type}
[warn] 	::::::::::::::::::::::::::::::::::::::::::::::
[warn] 
[warn] 	Note: Unresolved dependencies path:
[warn] 		javax.ws.rs:javax.ws.rs-api:2.1 (/Users/margus.sipria/Documents/workspace/sbt-bug/build.sbt#L5-8)
[warn] 		  +- default:sbt-bug_2.10:0.1-SNAPSHOT
[trace] Stack trace suppressed: run last *:update for the full output.
[error] (*:update) sbt.ResolveException: unresolved dependency: javax.ws.rs#javax.ws.rs-api;2.1: java.net.URISyntaxException: Illegal character in path at index 80: s3://maven.custom/releases/javax/ws/rs/javax.ws.rs-api/2.1/javax.ws.rs-api-2.1.${packaging.type}
[error] Total time: 5 s, completed Mar 12, 2018 3:52:38 PM
```
