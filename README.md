i[![Build Status](https://travis-ci.com/pgmpofu/blog-ws.svg?branch=master)](https://travis-ci.com/pgmpofu/blog-ws)
![Docker Cloud Build Status](https://img.shields.io/docker/cloud/build/pgmpofu/blog-ws)
# Game Review Blog

BlogWS is a simple web service that allows a user to create game reviews for sharing with the online community.

#Assumptions
- A comment cannot exist without a post.
- A comment cannot be created at the same time as a post.


# Development Environment

BlogWS is a Spring Boot application and can be run on your local machine as is or using a Docker container. The application runs on port 8888.

## Run on your local environment
- Install JDK 8
- Install Git
- If you are using the Maven plugin run the following command in the blog-ws directory:
    ` mvn spring-boot:run`
- If you are running a standalone application without the plugin run the following command in the blog-ws directory:
    `./mvnw spring-boot:run`
    
## Run with Docker
- See [here](https://hub.docker.com/r/pgmpofu/blog-ws) to download image if necessary
- Use the following command:
`docker container run -p 8888:8888 pgmpofu/blog-ws:latest`

## Contribute to BlogWS
We are so excited that you have decided to contribute to this project! Please create a pull request and one of our team members will review ypur changes.

