# Functional Programming in Scala

Exercises from the ["Functional Programming in Scala"](https://github.com/pchiusano/fpinscala) book,
test-driven using [specs2](http://etorreborre.github.io/specs2/)

## Note

### To initialise an IntelliJ/Eclipse project
    
    # Intellij
    sbt gen-idea
    
    # Eclipse
    sbt eclipse
    
### If SBT is running out of memory

Create `~/.sbtconfig` with the following:

    # File: ~/.sbtconfig
    SBT_OPTS="-XX:+UseConcMarkSweepGC -XX:+CMSClassUnloadingEnabled -XX:PermSize=256M -XX:MaxPermSize=512M"
