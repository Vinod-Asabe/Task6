pipeline {
    agent any
    
    stages {
        stage("Checkout") {
            steps {
                // Checkout code from the GitHub repository
                git branch: 'main', url: 'https://github.com/Vinod-Asabe/Task6.git'
            }
        }
        
        stage("Build") {
            steps {
                // Clean the project using Maven on Windows
                bat 'mvn clean install'
                // bat 'mvn clean'
            }
        }
        
        stage("Test") {
            steps {
                // Run tests using Maven on Windows
                bat 'mvn test'
            }
        }
        
        stage("Deploy") {
            steps {
                // Deployment steps can go here
                echo 'Deployed Successfully'
            }
        }
    }
}
