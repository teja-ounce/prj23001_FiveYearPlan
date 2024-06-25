pipeline {
    agent any
    environment {
        EDGE_DRIVER_PATH = 'C:/Users/Teja-OUNCE/OneDrive - proounce.com/Documents/GitHub/prj231001CucumberBDD/src/test/resources/files/msedgedriver.exe' // Adjust as needed
    }
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/teja-ounce/prj23001FiveYearPlan.git', credentialsId: 'GitLogin'
            }
        }

        stage('Build') {
            steps {
                dir('https://github.com/teja-ounce/prj23001_cucumber.git') {
                    bat 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                dir('https://github.com/teja-ounce/prj23001_cucumber.git') {
                    // Set the EdgeDriver system property
                    bat """
                    set WEB_DRIVER_PATH=%EDGE_DRIVER_PATH%
                    mvn test
                    """
                }
            }
        }

        stage('Allure Report') {
            steps {
                dir('https://github.com/teja-ounce/prj23001_cucumber.git') {
                    bat 'allure generate /allure-results --clean'
                }
            }
        }
    }

    post {
        always {
            // Adjust the path to where the test reports are generated
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
            junit '**/target/surefire-reports/*.xml'
        }
        failure {
            mail to: 'tej540840@gmail.com',
                 subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
                 body: "Something is wrong with ${env.BUILD_URL}"
        }
    }
}
