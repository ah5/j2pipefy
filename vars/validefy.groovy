#!/usr/bin/env groovy
import org.jenkinsci.plugins.credentialsbinding.impl.CredentialNotFoundException

/**
 * @description returns true if valid jenkins credential exists
 * @syntax validefy.jenkinsCredentialsId <credential-id>
 * @usage validefy.jenkinsCredentialsId "credential-id"
 * 
 * @param credential the credential
 * @return true if valid credential id
 */
def jenkinsCredentialsId(credential) {
    def valid = false
    try {
        withCredentials([string(credentialsId: credential, variable: 'credentialValue')]) {
            valid = true
        }
    } catch (CredentialNotFoundException ex) {
        logefy.debug "validating jenkins credentialsId failed" 
        logefy.exception(ex)
    }
    return valid
}