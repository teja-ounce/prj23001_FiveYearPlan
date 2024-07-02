pipeline {

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/teja-ounce/prj23001_cucumber.git', credentialsId: 'GitLogin'
            }
        }
        stage('Build') {
            steps {
                dir('C:/Proounce Project/prj23001_FiveYearPlan') {
                    bat 'mvn clean'
                }
            }
        }
        stage('Test') {
            steps {
                dir('C:/Proounce Project/prj23001_FiveYearPlan') {
                   bat "mvn test -Dcucumber.options=/src/test/resources/features/"
                }
            }
        }
        stage('Allure Report') {
            steps {
                dir('C:/Proounce Project/prj23001_FiveYearPlan') {
                     bat 'allure generate allure-results --clean'
                }
                }
            }
        }
        post {
        always {
            dir('C:/Proounce Project/prj23001_FiveYearPlan') {
                bat 'allure generate allure-results --clean -o allure-report'
                archiveArtifacts artifacts: 'allure-report/**', allowEmptyArchive: true
                junit 'target/surefire-reports/*.xml'
          	  }
   		 }
 	 }
  }
 