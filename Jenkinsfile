#!/usr/bin/env groovy
@Library('j2pipefy@feature/develop') _

pipeline {
    agent any
    stages {
        stage('Testing Vars') {
            steps {
                script {
                    logefy.info "This is a info message"
                    logefy.warning "This is a warning message"
                    logefy.debug "This is a debug message"
                }
            }
        }
    }
}