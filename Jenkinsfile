pipeline {
    agent any
    stages {

        stage("Environment Setup"){
            steps {
                echo "Cleaning"
                script{
                    sh './gradlew clean'
                }
            }
        }

        stage("Building"){
            steps {
              echo 'Building'
                 script{
                     sh './gradlew clean build'
                 }
            }
        }

        stage("Deploy"){
            steps {
                echo "Deploy to the tomcat"
                script {
                    cd build/libs
                    sh 'java -jar docker-0.1.jar'
                }
            }
        }

    }
}