pipeline {
   agent any

   environment {
       field = 'some'
   }
   stages {
       stage ('Preparation') {
           environment {
               JENKINS_PATH = sh(script: 'pwd', , returnStdout: true).trim()
           }
           steps {
               echo "Hello world"
               echo "PATH=${JENKINS_PATH}"
               sh 'echo "JP=$JENKINS_PATH"'
          }
      }
   }
}