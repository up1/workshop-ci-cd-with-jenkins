pipeline {
    agent any

    stages {
		stage('Checkout') {
            steps {
                checkout(scm)
            }
        }
        stage('Build') {
            steps {
                sh 'echo "Build passed"'
            }
        }
        stage('Test') {
            steps {
                sh 'echo "Test passed"'
            }
        }
        stage('Deliver for development') {
            when {
                branch 'develop' 
            }
            steps {
                sh 'echo "Deploy to development"'
                input message: 'Finished using the web site? (Click "Proceed" to continue)'
                sh 'echo "Deploy to development passed"'
            }
        }
        stage('Deploy for production') {
            when {
                branch 'main'  
            }
            steps {
                sh 'echo "Deploy to production"'
                input message: 'Finished using the web site? (Click "Proceed" to continue)'
                sh 'echo "Deploy to production passed"'
            }
        }
    }
}