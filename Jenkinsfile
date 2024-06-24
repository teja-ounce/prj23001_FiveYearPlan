pipeline {
    agent any
    environment {
        EDGE_DRIVER_PATH = 'C:/Program Files (x86)/Microsoft/Edge/Application/msedge.exe' // Replace with the actual path to msedgedriver.exe
    }
    stages {
        stage('Resource Check') {
            steps {
                bat 'systeminfo | findstr /C:"Total Physical Memory"'
                bat 'wmic OS get FreePhysicalMemory,TotalVisibleMemorySize /Value'
                bat 'wmic cpu get loadpercentage'
            }
        }
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
                    bat 'allure generate target/allure-results --clean'
                }
            }
        }
    }
    post {
        always {
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
