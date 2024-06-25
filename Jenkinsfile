pipeline {
    agent any
    environment {
        EDGE_DRIVER_PATH = 'C:/Users/Teja-OUNCE/Software/edgedriver_win64/msedgedriver.exe'
        M2_HOME = 'C:/Users/Teja-OUNCE/Software/Maven/apache-maven-3.9.7'  // Update with the actual path to your Maven installation
        PATH = "${env.PATH};${env.M2_HOME}/bin"
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
                    bat """
                        mvn test -Dwebdriver.edge.driver=%EDGE_DRIVER_PATH%
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
   
}
