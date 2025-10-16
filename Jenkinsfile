pipeline {
  agent any
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
      echo '✅ Build success! JAR file created.'
      archiveArtifacts artifacts: '*.jar'
    }
    failure {
      echo '❌ Build failed.'
    }
  }
}
