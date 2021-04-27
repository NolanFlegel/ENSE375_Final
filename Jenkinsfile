  
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

}
post {  //https://jenkins.io/doc/book/pipeline/syntax/#declarative-pipeline
      always {
        junit '**/reports/junit/*.xml'
      }
   } 

}



//  stage('Publish test results') {
//       junit '**/test-results/test/*.xml'
//   } 