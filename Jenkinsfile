  
pipeline {
  agent {
            docker {
                image 'maven:3-alpine'
                args '-v /root/.m2:/root/.m2'
                    }

                }

 stages {

    /*stage('Cloning our Git') { 
      steps {
        git 'https://github.com/NolanFlegel/ENSE375.git'
      }
    }*/

    stage('Run Tests') {
      
      steps {
          sh 'mvn clean test'
      }
    }

  //   stage('Building Image') {
  //     steps {
  //       script {
  //         dockerImage = docker.build registry + ":$BUILD_NUMBER"
  //       }
  //     }
  //   }

  // stage('Deploy Image') {
  //   steps {
  //     script {
  //       docker.withRegistry( '', registryCredential ) {
  //         dockerImage.push()
  //       }
  //     }
  //   }
  // }

  // stage('Cleaning up') {
  //   steps {
  //     sh "docker rmi $registry:$BUILD_NUMBER"
  //   }
  // }
}

}

