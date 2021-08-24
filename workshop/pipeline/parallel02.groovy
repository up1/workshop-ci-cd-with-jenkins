pipeline {
    agent none

    stages {
        stage("Demo parallel branch") {
            parallel {
                stage("Main branch") {
                    stages {
                        stage("build") {
                            steps {
                                echo "build in main"
                            }
                        }
                        stage("deploy") {
                            when {
                                branch "master"
                            }
                            steps {
                                echo "deploy for master"
                            }
                        }
                    }
                }

                stage("Develop branch") {
                    stages {
                        stage("build") {
                            steps {
                                echo "build in develop"
                            }
                        }
                        stage("deploy") {
                             when {
                                 branch "develop"
                             }
                             steps {
                                echo "deploy for develop"
                            }
                        }
                    }
                }
            }
        }
    }
}