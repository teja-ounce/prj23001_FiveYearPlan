pipeline {
    agent any
    environment {
        EDGE_DRIVER_PATH = 'C:/Users/Teja-OUNCE/Software/edgedriver_win64/msedgedriver.exe' // Adjust as needed
    }
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/teja-ounce/prj23001FiveYearPlan.git', credentialsId: 'GitLogin'
            }
        }

        stage('Build') {
            steps {
                dir('C:/Users/Teja-OUNCE/git/repository/prj231001CucumberBDD') {
                    bat 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                dir('C:/Users/Teja-OUNCE/git/repository/prj231001CucumberBDD') {
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
                dir('C:/Users/Teja-OUNCE/git/repository/prj231001CucumberBDD') {
                    bat 'allure generate target/allure-results --clean'
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
