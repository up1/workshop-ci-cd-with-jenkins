pipeline {
    agent any

	stages {
		stage('Push to docker hub') {
			steps {
				withCredentials([gitUsernamePassword(credentialsId: 'github', gitToolName: 'Default')]) {
					sh '''git clone https://github.com/up1/demo-private.git
						cd demo-private
						touch 1.txt
						git add 1.txt
						git commit -m "Demo"
						git push origin main'''
				}
			}
		}
	}
}