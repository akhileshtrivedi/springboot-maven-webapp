def gv

pipeline {
    agent any
    stages {
        stage("init") {
            steps {
                script {
                    gvy = load "script.groovy"
                }
            }
        }
        stage("build jar") {
            steps {
                script {
                    echo "building jar"
                    //gvy.buildJar()
                }
            }
        }
        stage("build image") {
            steps {
                script {
                    echo "building image"
                    //gvy.buildImage()
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    echo "deploying"
                    //gvy.deployApp()
                }
            }
        }
    }   
}
