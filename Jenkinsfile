pipeline {
    agent any

    tools {
        maven "M2_HOME"
    }
    withMaven(
        mavenLocalRepo: '$WORKSPACE/.repository', // (2)
       )
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/vatsanTraining/jenkins_lab.git'
                dir('scm-pipeline/pipeline-scm'){
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
