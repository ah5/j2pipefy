#!/usr/bin/env groovy

/**
 * @description echoes info
 * @syntax logefy.info <message>
 * @usage logefy.info "info"
 * 
 * @param message the message to be displayed
 */
def info(message) {
    if(stringefy.isEmpty(message)) error "logefy.info: param message cannot be empty"
    echo "INFO:" + valuefy.SPACE + message
}

/**
 * @description echoes warning
 * @syntax logefy.warning <message>
 * @usage logefy.warning "warning"
 * 
 * @param message the message to be displayed
 */
def warning(message) {
    if(stringefy.isEmpty(message)) error "logefy.warning: param message cannot be empty"
    echo "WARNING:" + valuefy.SPACE + message
}

/**
 * @description echoes debug
 * @syntax logefy.debug <message>
 * @usage logefy.debug "debug"
 * 
 * @param message the message to be displayed
 */
def debug(message) {
    if(stringefy.isEmpty(message)) error "logefy.debug: param message cannot be empty"
    echo "DEBUG:" + valuefy.SPACE + message
}

/**
 * @description echoes exception
 * @syntax logefy.exception <message>
 * @usage logefy.exception "exception"
 * 
 * @param ex the exception object
 */
def exception(ex) {
    if(ex==null) error "logefy.exception: param ex cannot be null"
    try {
        echo "EXCEPTION:" + valuefy.SPACE + ex.getMessage()
    } catch(exception) {
        error "logefy.exception: exception getting message from exception object"
    }
}