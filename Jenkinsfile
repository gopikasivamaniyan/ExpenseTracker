pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Compiling Java files...'
        sh 'javac *.java'
      }
    }
    stage('Test') {
      steps {
        echo 'Running tests...'
        sh 'java Main'
      }
    }
    stage('Package') {
      steps {
        echo 'Creating JAR file...'
        sh 'jar cf ExpenseTracker.jar *.class'
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
