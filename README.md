Bug report showcasing a compose compiler issue

The issue seems like it happens when an app uses a library with some
complex (generic related?) @Composable code.

To repro:

* ./gradlew compileKotlinJs

Project setup:

* Library code in `somelib`
* App code in `somewebapp` which depends on `somelib`
* Library code contains some interfaces with complex generic setup
* App code tries to override an interface in main.kt
* Compose barfs with an "IllegalStateException: Couldn't find implementation" error

The problematic override lives in main.kt. Check the file -- it has comments.

If you comment out the problematic override or move it out of `somewebapp` into
 `somelib`, then the code compiles again.

