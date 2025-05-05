#!/bin/bash

pipeline {
  agent any
    tools{
        maven:"maven"
    }
    stages{
        stage('checkout'){
            steps{
                 git 'https://github.com/vatsanTraining/jenkins_lab.git'

            }

        }
        stage('build'){
            steps{
                        sh 'mvn -B -DskipTests clean install' // Clean, package, and install the artifact

            }
        }
    }

}

  
