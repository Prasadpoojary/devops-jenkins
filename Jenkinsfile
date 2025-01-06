pipeline{
    agent any

    tools
    {
        maven 'Maven'
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

        stage("Deploy")
        {
            steps{
                deploy adapters: [tomcat9(credentialsId: 'admin', path: '', url: 'http://localhost:9090/')], contextPath: 'DevopsDemo', onFailure: false, war: '**/*.war'
            }
        }
    }
}