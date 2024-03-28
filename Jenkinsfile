pipeline {
    agent any

    tools{
        maven 'Maven'
    }
    
    stages {
        stage("Checkout") {
            steps {
                git branch: 'main', url: 'https://github.com/Vinod-Asabe/Task6.git'
            }
        }
        
        stage("Build") {
            steps {
                bat 'mvn clean'
            }
        }
        
        stage("Test") {
            steps {
                bat 'mvn test'
            }
        }
        
        stage("Deploy") {
            steps {
                echo 'Deployed Successfully'
            }
        }
    }
}
