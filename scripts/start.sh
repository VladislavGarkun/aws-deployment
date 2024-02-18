#!/usr/bin/env bash

if [ "$DEPLOYMENT_GROUP_NAME" == "billing" ]
then
    nohup java -jar -Dspring.profiles.active=dev /tmp/billing-service.jar > /dev/null 2> /dev/null < /dev/null &
else
    nohup java -jar -Dspring.profiles.active=dev /tmp/order-service.jar > /dev/null 2> /dev/null < /dev/null &
fi
#else
#  echo "No running applications was found for the deployment group name!"
#fi

exit 0