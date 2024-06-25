pipeline {
    agent any
    environment {
        EDGE_DRIVER_PATH = 'C:/Users/Public/Downloads/edgedriver_win64/msedgedriver.exe' // Adjust as needed
    }
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/teja-ounce/prj23001_cucumber.git', credentialsId: 'GitLogin'
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
}
