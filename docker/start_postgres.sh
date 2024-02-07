#!/usr/bin/env bash

docker run -d -p 5432:5432 -v ./db/:/docker-entrypoint-initdb.d/ -e POSTGRES_PASSWORD=postgres postgres:16.1
