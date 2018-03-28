#!/usr/bin/env groovy

/**
 * @description echoes info
 * @syntax logfy.info <message>
 * @usage logfy.info "info"
 * 
 * @param message the message to be displayed
 */
def info(message) {
    echo "INFO:" + valuefy.SPACE + message
}

/**
 * @description echoes warning
 * @syntax logfy.warning <message>
 * @usage logfy.warning "warning"
 * 
 * @param message the message to be displayed
 */
def warning(message) {
    echo "WARNING:" + valuefy.SPACE + message
}

/**
 * @description echoes debug
 * @syntax logfy.debug <message>
 * @usage logfy.debug "debug"
 * 
 * @param message the message to be displayed
 */
def debug(message) {
    echo "DEBUG:" + valuefy.SPACE + message
}

/**
 * @description echoes exception
 * @syntax logfy.exception <message>
 * @usage logfy.exception "exception"
 * 
 * @param message the message to be displayed
 */
def exception(message) {
    echo "EXCEPTION:" + valuefy.SPACE + ex.getMessage()
}