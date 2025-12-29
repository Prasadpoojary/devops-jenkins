// pipeline{
//     agent any
//
//     tools
//     {
//         maven 'Maven'
//     }
//
//     stages{
//         stage("Checkout from GIT"){
//             steps{
//                 checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Prasadpoojary/devops-jenkins.git']])
//             }
//         }
//
//         stage("Build Project"){
//             steps{
//             script{
//                    sh 'mvn clean install'
//                     }
//                 }
//
//         }
//
//
//     }
// }