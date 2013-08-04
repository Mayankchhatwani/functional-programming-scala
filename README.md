# Scala Experiments

## Caveats

* SBT running out of memmory: create ~/.sbtconfig with following config:

    SBT_OPTS="-XX:+UseConcMarkSweepGC -XX:+CMSClassUnloadingEnabled -XX:PermSize=256M -XX:MaxPermSize=512M"
