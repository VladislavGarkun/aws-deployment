#!/usr/bin/env bash

while 'true'
do
    if [ "$(curl -s http://localhost:8080/health)" = '{"status":"200"}' ]
    then
        echo "Application is running!"
        exit 0
    else
        echo "Checking application status..."
        sleep 3s
    fi
done