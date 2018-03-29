#!/usr/bin/env groovy
@Library('j2pipefy@feature/develop') _

pipeline {
    agent any
    stages {
        stage('Testing Vars') {
            steps {
                script {
                    logefy.info "this is a info message"
                    logefy.warning "this is a warning message"
                    logefy.debug "this is a debug message"
                }
            }
        }
    }
}