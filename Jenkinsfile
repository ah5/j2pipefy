#!/usr/bin/env groovy
@Library('j2pipefy@feature/develop') _
import groovy.transform.Field
import com.ah5.j2pipefy.tool.*

@Field def Ansible ansibleTool = new Ansible()
@Field def Docker dockerTool = new Docker()

pipeline {
    agent any
    stages {
        stage('Testing Vars') {
            steps {
                script {
                    logefy.info "This is a info message"
                    logefy.warning "This is a warning message"
                    logefy.debug "This is a debug message"
                    ansibleTool.version()
                }
            }
        }
    }
}