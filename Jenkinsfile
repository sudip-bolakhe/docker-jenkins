pipeline{
    agent any
    stages{

        stage("Environment Building"){
            step{
                echo "Building"
            }
        }

        stage("Testing"){
            step{
                echo "Running the test"
            }
        }

        stage("Deploy"){
            step{
                echo "Deploy to the tomcat"
            }
        }
    }
}