pipeline {
    agent any
    tools {
        jdk 'java 17'   // same name as added in Jenkins tools
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
                echo 'Creating JAR file...'
                bat 'jar cf ExpenseTracker.jar *.class'
            }
        }
    }

    post {
        success {
            echo '✅ Build completed successfully!'
        }
        failure {
            echo '❌ Build failed.'
        }
    }
}
