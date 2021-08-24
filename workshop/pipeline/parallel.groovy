pipeline {
    agent any

    stages {
        stage('parallel') {
            parallel {
                stage('Test On Windows') {
                    steps {
                        echo "Test On Windows"
                    }
                }
                stage('Test On Linux') {
                    steps {
                        echo "Test On Linux"
                    }
                }
            }
        }
    }
}

