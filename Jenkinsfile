pipeline {
    agent any

    tools {
        maven "M2_HOME"
    }

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/vatsanTraining/jenkins_lab.git'
                dir('pipleline-scm'){
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
