pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/tkgregory/gradle-credentials-jenkins.git'

                sh './gradlew build'
            }
        }
    }
}