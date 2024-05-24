pipeline {
  agent any
  stages {
    stage('war') {
      steps {
        withGradle() {
          sh './gradlew build'
        }

      }
    }

  }
}