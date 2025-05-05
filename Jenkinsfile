#!/bin/bash
pipeline {
  agent any

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
        sh 'mvn -B -DskipTests clean package' // Clean, package, and install the artifact
      }
    }
    
    stage('Test') {
      steps {
        // Run the Maven tests if needed
        sh 'mvn -B -DskipTests=false test'
      }
    }
  }
    
  

  post {
    failure {
      // Code to run if the build fails
      // For example, send an email or a notification
      // See the Jenkins documentation for available actions
    }

    success {
      // Code to run if the build is successful
      // For example, deploy the artifact to a server
      // See the Jenkins documentation for available actions
    }
  }

}
