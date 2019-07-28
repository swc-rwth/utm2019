pipeline {
    agent {
        label "master"
    }
    tools {
        maven 'maven'
    }

    stages {
        stage( 'Setup & Prepare') {
            steps {
                git url: 'https://github.com/swc-rwth/utm2019.git', branch: 'master'
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

        stage("Docker Build") {
            steps {
                sh "mvn -B --settings settings.xml docker:build docker:push"
            }
        }
    }

}

