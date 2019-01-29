# How to test webapp

## Using Maven & embedded Apache Tomcat (by plugin)

Open Maven Projects facet (at the right of IDEA), then double-click:
* clean (if something previously generated at target/)
* package (build war, found at target/javacourse181112-1.0-SNAPSHOT.war)
* tomcat7 -> run-war (right-click, run or debug mode)

## Using pre-installed Apache Tomcat
### Hot deploy (cp-paste war file at webapp dir; Tomcat is constantly watching webapps for new war archives to deploy)
### Using Manager web application, distributed (usually) with Tomcat

## Using Application Servers IDEA's integration (only available with Intellij IDEA Enterprise Edition)