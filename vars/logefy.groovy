#!/usr/bin/env groovy

/**
 * @description echoes info
 * @syntax logefy.info <message>
 * @usage logefy.info "info"
 * 
 * @param message the message to be displayed
 */
def info(message) {
    if(stringefy.isEmpty(message)) logefy.error "logefy.info: param message cannot be empty"
    echo "INFO:" + valuefy.SPACE + message.trim().capitalize()
}

/**
 * @description echoes warning
 * @syntax logefy.warning <message>
 * @usage logefy.warning "warning"
 * 
 * @param message the message to be displayed
 */
def warning(message) {
    if(stringefy.isEmpty(message)) logefy.error "logefy.warning: param message cannot be empty"
    echo "WARNING:" + valuefy.SPACE + message.trim().capitalize()
}

/**
 * @description echoes debug
 * @syntax logefy.debug <message>
 * @usage logefy.debug "debug"
 * 
 * @param message the message to be displayed
 */
def debug(message) {
    if(stringefy.isEmpty(message)) logefy.error "logefy.debug: param message cannot be empty"
    echo "DEBUG:" + valuefy.SPACE + message.trim().capitalize()
}

/**
 * @description errors out with message
 * @syntax logefy.error <message>
 * @usage logefy.error "error"
 * 
 * @param message the message to be displayed
 */
def error(message) {
    if(stringefy.isEmpty(message)) error "logefy.error: param message cannot be empty"
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
    if(ex==null) logefy.error "logefy.exception: param ex cannot be null"
    try {
        echo "EXCEPTION:" + valuefy.SPACE + ex.getMessage().trim().capitalize()
    } catch(exception) {
        logefy.error "logefy.exception: exception getting message from exception object"
    }
}