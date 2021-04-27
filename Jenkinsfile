  
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

    stage('Publish Tests') {    //From plugins.jenkins.io/junit
    junit 'test-results.xml'
     }

}

}

