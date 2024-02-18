#!/usr/bin/env bash

nohup java -jar -Dspring.profiles.active=dev /tmp/aws-deployment.jar > /dev/null 2> /dev/null < /dev/null &
exit 0