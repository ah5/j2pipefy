#!/usr/bin/env groovy
import java.lang.Exception

/**
 * @description echoes info
 * @syntax logefy.info <message>
 * @usage logefy.info "info"
 * 
 * @param message the message to be displayed
 */
def info(message) {
    if(!message?.trim()) error "logefy.info: Param message cannot be empty."
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
    if(!message?.trim()) error "logefy.warning: Param message cannot be empty."
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
    if(!message?.trim()) error "logefy.debug: Param message cannot be empty."
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
    if(!message?.trim()) error "logefy.error: Param message cannot be empty."
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
    if(ex==null) error "logefy.exception: Param ex cannot be null."
    else if(!(ex instanceof Exception)) {
        error "logefy.exception: Param has to be an exception object."
    }
    try {
        echo "EXCEPTION: " + ex.getMessage().trim().capitalize()
    } catch(exception) {
        error "logefy.exception: Exception getting message from exception object."
    } finally {
        error "Exception has occured, aborting abruptly."
    }
}

return this