  
pipeline {
  agent {
            docker {
                image 'maven:3-alpine'
                args '-v /root/.m2:/root/.m2'
                    }

                }

 stages {
    stage('Run Time24 Test') {      
      steps {
          sh 'mvn -Dtest=Time24Test test'
      }
    }
    stage('Run Time12 Test') {      
      steps {
          sh 'mvn -Dtest=Time12SubtractTest test'
      }
    }
    stage('Run Time12 Test') {      
      steps {
          sh 'mvn -Dtest=DateLessThanTest test'
      }
    }

}
post {  //https://jenkins.io/doc/book/pipeline/syntax/#declarative-pipeline
      always {
        junit '**/target/surefire-reports/*.xml'
      }
   } 

}



//  stage('Publish test results') {
//       junit '**/test-results/test/*.xml'
//   } 