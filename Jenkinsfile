pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',url: 'https://github.com/kesarwanishubhi/ScientificCalculator'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                sh 'docker build -t kesarwani05/scientific-calculator .'
                sh 'docker run -d -p 9090:8080 kesarwani05/scientific-calculator'
            }
        }
    }
}
