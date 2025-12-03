// the first start with pipeline { set up agent and stages inside pipeline }
pipeline {

    // any คือ ใช้ executor ใด ๆ ก็ได้
    agent any

    // stages as working Flows tell Pipeline what gonna do
    stages {
            stage('Before initial check software installed') {
                steps {
                      sh 'java -version'
                      sh 'mvn -version'
                      sh 'git --version'
                }
            }


        }
    }