pipeline {
    agent any

    tools {
        maven "M2_HOME"
    }

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/vatsanTraining/jenkins_lab.git'
                dir('scm_pipeline/pipleline-scm'){
                  bat 'mvn -Dmaven.test.failure.ignore=true clean package'
                }
            }

            post {
                success {
                    archiveArtifacts 'scm_pipeline/pipeline-scm/target/*.jar'
                }
            }
        }
    }
}
