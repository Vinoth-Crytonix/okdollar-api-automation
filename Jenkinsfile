pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'Java-11'
    }

    stages {
        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('Publish Cucumber Report') {
            steps {
                publishHTML([
                    allowMissing: false,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: 'target/cucumber-reports',
                    reportFiles: 'cucumber-html-reports.html',
                    reportName: 'Cucumber Test Report'
                ])
            }
        }
    }

    post {
        always {
            echo 'Build finished.'
        }
    }
}
