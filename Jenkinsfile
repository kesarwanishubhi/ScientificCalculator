pipeline {
    agent any
    environment {
        DOCKER_IMAGE = 'kesarwani05/scientific-calculator'  // Define the Docker image name
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/kesarwanishubhi/ScientificCalculator'
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

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $DOCKER_IMAGE .'
            }
        }

        stage('Push Docker Image to Docker Hub') {
            steps {
                withCredentials([string(credentialsId: 'docker-hub-token', variable: 'DOCKER_PASSWORD')]) {
                    sh 'echo $DOCKER_PASSWORD | docker login -u kesarwani05 --password-stdin'
                    sh 'docker push $DOCKER_IMAGE:latest'
                }
            }
        }

        stage('Deploy with Ansible') {  // ✅ Fixed - No nested stage
            steps {
                sh 'wsl -u root -- bash -c "ansible-playbook -i /root/ansible-deployment/inventory.ini /root/ansible-deployment/deploy.yml"'
            }
        }
        stage('Debug WSL') {
            steps {
                sh 'wsl -u root whoami'
            }
        }
    }
}
