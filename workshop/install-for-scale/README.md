## Step to run

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
