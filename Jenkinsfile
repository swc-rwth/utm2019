pipeline {
    agent {
        label "master"
    }
    tools {
        maven 'M3'
    }

    stages {
        stage( 'Setup & Prepare') {
            steps {
                git url: 'https://github.com/swc-rwth/utm2018-spring-boot.git', branch: 'master'
            }
        }

        stage("Build and Test") {
            steps {
                sh "mvn -B clean package -DskipTests=true"
            }
        }
        stage("Build w/o Test") {
            steps {
                sh "mvn -B clean package -DskipTests=true"
            }
        }
        
        stage("Test") {
            steps {
                sh "mvn -B test"
            }
        }
    }

}

