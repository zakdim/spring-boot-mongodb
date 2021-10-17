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

### Lecture 266: Assigning Storage

```
$ cd
$ mkdir -p dockerdata/mongo
$ docker run -p 27017:27017 \
  -v $HOME/dockerdata/mongo:/data/db \
  -d mongo

```

### Lecture 268: Run Rabbit MQ Container

``` 
$ docker run -d \
    --hostname guru-rabbit \
    --name some-rabbit \
    -p 8080:15672 \
    -p 5671:5671 \
    -p 5672:5672 \
    rabbitmq:3-management
```

### Lecture 269: Assignment - Run MySQL in a Container

``` 
$ cd $HOME/tmp

$ docker run \
    --name guru-mysql \
    -e MYSQL_ALLOW_EMPTY_PASSWORD=yes \
    -v $HOME/tmp:/var/lib/mysql \
    -p 3306:3306 \
    -d mysql:5.7
```

### Lecture 270: Assignment Review

* Download [Sequel Pro](https://www.sequelpro.com/)

* Sequel Pro - Enter connection deails:

Option: **Standard**

| Key       | Value     |
| --------- | --------- |
| Name:     | 127.0.0.1 |
| Host:     | 127.0.0.1 |
| Username: | root      |
| Database: | optional  |
| Port:     | 3306      |
