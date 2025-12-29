pipeline{
    agent any

    tools
    {
        maven 'Maven'
    }

    environment{
        APP_NAME="spring-cicd"
        RELEASE_NUMBER="2.0.0"
        DOCKER_USER="prasadpoojary"
        IMAGE_NAME="${DOCKER_USER}/${APP_NAME}"
        IMAGE_TAG="${RELEASE_NUMBER}-${BUILD_NUMBER}"

    }

    stages{
        stage("Checkout from GIT"){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Prasadpoojary/devops-jenkins.git']])
            }
        }

        stage("Build Project"){
            steps{
            script{
                   sh 'mvn clean install'
                    }
                }

        }

        stage("Build Image"){
            steps{
            script{
                   sh 'docker build -t ${IMAGE_NAME}:${IMAGE_TAG} .'
                    }
                }

        }

        stage("Deploy Image to docker hub"){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockercred', variable: 'dockercred')]) {
                        sh 'docker login -u ${DOCKER_USER} -p ${dockercred}'
                        //sh 'docker tag spring-cicd:1.0 ${IMAGE_NAME}:${IMAGE_TAG}'
                        sh 'docker push ${IMAGE_NAME}:${IMAGE_TAG}'
                    }
                }
            }
        }

    }
}