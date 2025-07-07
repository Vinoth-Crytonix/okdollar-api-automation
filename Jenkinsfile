pipeline {
    agent any

    tools {
        maven 'Maven 3.9.6'   // Use exact Maven name from Jenkins Global Tools
        jdk 'JDK 17'          // Or 'JDK 11' if that’s what you use
    }

    environment {
        REPORT_PATH = "target/cucumber-report.html"
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Vinoth-Crytonix/okdollar-api-automation'  // Replace with your GitHub repo URL
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('Publish Report') {
            steps {
                publishHTML(target: [
                    reportDir: 'target',
                    reportFiles: 'cucumber-report.html',
                    reportName: 'Cucumber Report',
                    keepAll: true
                ])
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '**/target/*.html', allowEmptyArchive: true
        }
    }
}
