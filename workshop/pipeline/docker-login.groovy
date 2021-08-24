pipeline {
    agent any

stages {
	stage('Push to docker hub') {
		steps {
			withCredentials([usernamePassword(credentialsId: 'docker_login', passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
				sh 'echo "$PASSWORD" | docker login -u "$USERNAME" --password-stdin'
				sh 'docker image pull  nginx'
				sh 'docker image tag nginx somkiat/nginx_xxx'
				sh 'docker image push somkiat/nginx_xxx'
			}
		}
	}
}
}