pipeline {
    agent any

    tools {
        maven "maven"
    }

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/vatsanTraining/jenkins_lab.git'
                dir('pipeline-scm'){
                  bat 'mvn -Dmaven.test.failure.ignore=true clean package'
                }
            }

            post {
                success {
                    archiveArtifacts 'pipeline-scm/target/*.jar'
                }
            }
        }
    }
}
