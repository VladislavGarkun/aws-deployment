#!/usr/bin/env bash

echo "Uploading Cloudwatch configuration..."
sudo /opt/aws/amazon-cloudwatch-agent/bin/amazon-cloudwatch-agent-ctl -a fetch-config -m ec2 -s -c file:/tmp/.aws/amazon-cloudwatch-agent.json

echo "Trying to run application..."
nohup java -jar -Dspring.profiles.active=dev /tmp/target/aws-deployment.jar > /dev/null 2> /dev/null < /dev/null &
exit 0