#!/usr/bin/env bash

docker run -d -p 9000:80 -v ./nginx.conf:/etc/nginx/conf.d/default.conf nginx
