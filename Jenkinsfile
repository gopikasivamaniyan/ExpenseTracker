pipeline {
    agent any
    tools {
        jdk 'java 17'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Compiling Java files...'
                bat 'javac *.java'
            }
        }

        stage('Test') {
            steps {
                echo 'Running main class...'
                bat 'java Main'
            }
        }

        stage('Package') {
            steps {
                echo 'Creating executable JAR file...'
                bat 'echo Main-Class: Main > manifest.txt'
                bat 'jar cfm ExpenseTracker.jar manifest.txt *.class'
            }
        }
    }

    post {
        success {
            echo '✅ Build completed successfully!'
            archiveArtifacts artifacts: 'ExpenseTracker.jar', fingerprint: true
        }
        failure {
            echo '❌ Build failed.'
        }
    }
}
