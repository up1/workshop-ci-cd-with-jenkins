pipeline {
    agent any
	stages {
		stage("build") {
			input {
					message "Deploy ?"
					ok "Yes, i do."
					submitter "Somkiat.p"
					parameters {
						string(name: 'Data', defaultValue: 'hello', description: 'Who should I say hello to?')
					}
			}
			steps {
				echo "Hello, ${Data}."
			}
		}
	}
}
