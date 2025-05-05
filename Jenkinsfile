#!/bin/bash
pipeline {
  agent any
 tools {
        maven "maven"
    }
  stages {
    stage('Checkout') {
      steps {
        // Checkout the source code from your Git repository
        git 'https://github.com/vatsanTraining/jenkins_lab.git' // Replace with your Git repository URL
        // You can also specify the branch here if needed
      }
    }

    stage('Build') {
      steps {
        // Run the Maven build commands
        dir('pipeline-scm'){
        sh 'mvn -B -DskipTests clean package'
        }// Clean, package, and install the artifact
      }
    }
    
    stage('Test') {
      steps {
        // Run the Maven tests if needed
        sh 'mvn -B -DskipTests=false test'
      }
    }
  }
    
  

 
}
