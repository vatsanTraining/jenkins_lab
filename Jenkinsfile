#!/bin/bash

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
                   maven.mvn(['clean', 'package'])
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


