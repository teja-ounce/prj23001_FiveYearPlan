pipeline {
    agent any
    
    environment {
        EDGE_DRIVER_PATH = 'C:/Users/Teja-OUNCE/Software/edgedriver_win64/msedgedriver.exe'
    }
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout the Git repository
                git url: 'https://github.com/teja-ounce/prj23001FiveYearPlan.git', credentialsId: 'GitLogin'
            }
        }

        stage('Build') {
            steps {
                dir('C:/Users/Teja-OUNCE/git/repository/prj231001CucumberBDD/') {
                    // Build the project using Maven
                    bat 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                dir('C:/Users/Teja-OUNCE/git/repository/prj231001CucumberBDD/') {
                    // Run tests using Maven
                    bat 'mvn test'
                }
            }
        }

        stage('Allure Report') {
            steps {
                dir('C:/Users/Teja-OUNCE/git/repository/prj231001CucumberBDD/') {
                    // Generate Allure report
                    bat 'allure generate target/allure-results --clean'
                }
            }
        }
    }

    post {
        always {
            // Archive artifacts and publish JUnit test results
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
            junit '**/target/surefire-reports/*.xml'
        }
        
        failure {
            // Send email in case of build failure
            mail to: 'tej540840@gmail.com',
                 subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
                 body: "Something is wrong with ${env.BUILD_URL}"
        }
    }
}
