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
                    sh 'java -jar ./build/libs/docker-jenkins.0.1.jar'
                }
            }
        }

    }
}