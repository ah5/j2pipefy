#!/usr/bin/env groovy

/**
 * @description echoes info
 * @syntax logefy.info <message>
 * @usage logefy.info "info"
 * 
 * @param message the message to be displayed
 */
def info(message) {
    if(stringefy.isEmpty(message)) logefy.error "logefy.info: Param message cannot be empty."
    echo "INFO: " + message.trim()
}

/**
 * @description echoes warning
 * @syntax logefy.warning <message>
 * @usage logefy.warning "warning"
 * 
 * @param message the message to be displayed
 */
def warning(message) {
    if(stringefy.isEmpty(message)) logefy.error "logefy.warning: Param message cannot be empty."
    echo "WARNING: " + message.trim()
}

/**
 * @description echoes debug
 * @syntax logefy.debug <message>
 * @usage logefy.debug "debug"
 * 
 * @param message the message to be displayed
 */
def debug(message) {
    if(stringefy.isEmpty(message)) logefy.error "logefy.debug: Param message cannot be empty."
    echo "DEBUG: " + message.trim()
}

/**
 * @description errors out with message
 * @syntax logefy.error <message>
 * @usage logefy.error "error"
 * 
 * @param message the message to be displayed
 */
def error(message) {
    if(stringefy.isEmpty(message)) error "logefy.error: Param message cannot be empty."
    error message.trim()
}

/**
 * @description echoes exception message
 * @syntax logefy.exception <exception>
 * @usage logefy.exception "exception"
 * 
 * @param ex the exception object
 */
def exception(ex) {
    if(ex==null) logefy.error "logefy.exception: Param ex cannot be null."
    try {
        echo "EXCEPTION: " + ex.getMessage().trim().capitalize()
    } catch(exception) {
        logefy.error "logefy.exception: Exception getting message from exception object."
    } finally {
        logefy.error "Exception has occured, aborting abruptly."
    }
}