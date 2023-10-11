pipeline {
    agent default
    stages {
        stage('Checkout') {
            steps {
              checkout scm
             }
        }
        stage('Build') {
            steps {
                // You can add build steps here if needed
                withSonarQubeEnv('sonarqube') {
                  sh 'mvn clean verify sonar:sonar -Dsonar.projectKey=Jenkins' // Example Maven build step
                 }
                 timeout(time: 1, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                 }
            }
        }
    }
}

    