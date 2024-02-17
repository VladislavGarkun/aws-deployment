#!/bin/bash
source ~/.bashrc
# To kill the process incase of redeployment
kill -9 $(lsof -i :8080)
cd /home/ec2-user/my-web-server/
nohup java -jar aws-deployment.jar &> webserverlog.log &