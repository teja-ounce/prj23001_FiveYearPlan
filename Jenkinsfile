pipeline {
    agent any
    environment {
        EDGE_DRIVER_PATH = 'C:/Program Files (x86)/Microsoft/Edge/Application/msedge.exe' // Adjust as needed
    }
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/teja-ounce/prj23001_cucumber.git', credentialsId: 'GitLogin'
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
                    bat 'allure generate /allure-results --clean'
                }
            }
        }
        stage('List Directory') {
    steps {
        dir('C:/Users/Teja-OUNCE/git/repository/prj231001CucumberBDD') {
            bat 'dir'
        }
    }
}
        
    }
}
