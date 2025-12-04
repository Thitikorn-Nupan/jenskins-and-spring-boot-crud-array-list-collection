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
                      sh 'docker --version'
                }
            }

            stage('Checkout git repo') {
                steps {
                    // Checks out the source code from your Git repository. *** Note, by default it will pull repo to C:\ProgramData\Jenkins\.jenkins\workspace\...
                    git branch: 'ttknp-spring-boot-3', url: 'https://github.com/Thitikorn-Nupan/jenskins-and-spring-boot-crud-array-list-collection.git'
                }
            }


            stage('Test maven') {
                steps {
                    // Compiles and runs the project's unit tests using the Surefire plugin (for unit tests) and Failsafe plugin (for integration tests).
                    sh "mvn clean test"
                }
            }


            stage('Build maven') {
                steps {
                    // Builds the Spring Boot application using maven
                    sh "mvn clean install -DskipTests"
                }
            }

            stage('Build docker') {
                steps {
                    sh "docker build -t basic-api:latest --build-arg JAR_FILE=target/basic-api-using-spring-boot-3-0.0.1-SNAPSHOT.jar ."

                }
            }

            stage('Deploy') {
                steps {
                    sh "docker run --name backend -p 8080:8080 -d basic-api:latest"
                }
            }

        }
    }