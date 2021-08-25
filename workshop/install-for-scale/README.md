## Step to run
* [Jenkins master](https://hub.docker.com/r/jenkins/jenkins)
* [Jenkins slave](https://hub.docker.com/r/jenkins/inbound-agent/)
### Master
```
$docker-compose up -d jenkins_master
$docker-compose ps
$docker-compose logs --follow
```

### Node/Slave/worker
```
$docker-compose up -d jenkins_slave
$docker-compose ps
$docker-compose logs --follow
```
