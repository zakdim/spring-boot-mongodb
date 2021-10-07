# Spring Framework 5: Beginner to Guru

## Section 14: Working with Containers and Images

### Lecture 262: Assignment Review

* Run mongo docker container

```
$ docker pull mongo

$ docker images
REPOSITORY   TAG       IMAGE ID       CREATED      SIZE
mongo        latest    c1a14d3979c5   5 days ago   691MB

$ docker run -p 27017:27017 -d mongo
```

* Display docker logs for mongo container

``` 
docker logs -f <CONTAINER_ID>
```

* Run spring boot application using Maven command

``` 
mvn spring-boot:run
```