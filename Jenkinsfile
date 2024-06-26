pipeline {
    agent {
        label 'jenkins-agent'  // Replace with the label of your Jenkins agent
    }
    environment {
        EDGE_DRIVER_PATH = 'C:/Users/Teja-OUNCE/Software/edgedriver_win64/msedgedriver.exe'
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
                    bat "mvn test -Dwebdriver.edge.driver=${EDGE_DRIVER_PATH}"
                }
            }
        }
        stage('Allure Report') {
            steps {
                dir('C:/Users/Teja-OUNCE/git/repository/prj231001CucumberBDD') {
                    bat '/allure-results --clean'
                }
            }
        }
    }
    }