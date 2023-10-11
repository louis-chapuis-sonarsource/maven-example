pipeline {
  agent none
  stages {
    stage("build & SonarQube analysis") {
      agent any
      steps {
        withSonarQubeEnv('My SonarQube Server') {
          dir("maven-basic") {
            sh 'mvn clean package sonar:sonar'
          }        
        }
      }
    }
    stage("Quality Gate") {
      steps {
        timeout(time: 1, unit: 'MINUTES') {
          waitForQualityGate abortPipeline: true
        }
      }
    }
  }
}
    