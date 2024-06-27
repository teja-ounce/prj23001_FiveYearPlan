pipeline {
agent {
        label 'edge'
    }

    environment {
        EDGE_DRIVER_PATH = 'C:/Users/proou/software/edgedriver_win64/msedgedriver.exe'
    }
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/teja-ounce/prj23001_cucumber.git', credentialsId: 'GitLogin'
            }
        }
        stage('Build') {
            steps {
                dir('C:/Users/proou/eclipse-workspace/prj23001_cucumber-master/prj23001_cucumber-master') {
                    bat 'mvn clean'
                }
            }
        }
        stage('Test') {
            steps {
                dir('C:/Users/proou/eclipse-workspace/prj23001_cucumber-master/prj23001_cucumber-master') {
                   bat "mvn test -Dcucumber.options=\"src/test/resources/features\" -Dwebdriver.edge.driver=${EDGE_DRIVER_PATH}"
                }
            }
        }
        stage('Allure Report') {
            steps {
                dir('C:/Users/proou/eclipse-workspace/prj23001_cucumber-master/prj23001_cucumber-master') {
                     bat 'allure generate allure-results --clean'
                }
                }
            }
        }
        post {
        always {
            dir('C:/Users/proou/eclipse-workspace/prj23001_cucumber-master/prj23001_cucumber-master') {
                bat 'allure generate allure-results --clean -o allure-report'
                archiveArtifacts artifacts: 'allure-report/**', allowEmptyArchive: true
                junit 'target/surefire-reports/*.xml'
          	  }
   		 }
 	 }
  }
 