#!/usr/bin/env groovy
@Library('j2pipefy') _

pipeline {
    agent any
    stages {
        stage('Log') {
            steps {
                script {
                    logfy.info "this is a test message"
                }
            }
        }
    }
}