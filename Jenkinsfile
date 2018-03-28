#!/usr/bin/env groovy
@Library('j2pipefy@feature/develop') _

pipeline {
    agent any
    stages {
        stage('Log') {
            steps {
                script {
                    logefy.info "this is a test message"
                }
            }
        }
    }
}