#!/usr/bin/env groovy

/**
 * @description checks if string is empty
 * @syntax stringefy.isEmpty <str>
 * @usage stringefy.isEmpty "str"
 * 
 * @param str the string to be verified
 * @return true if empty
 */
def isEmpty(str) {
    return ((!str?.trim())? true: false)
}

/**
 * @description checks if string is not empty
 * @syntax stringefy.isNotEmpty <str>
 * @usage stringefy.isNotEmpty "str"
 * 
 * @param str the string to be verified
 * @return true if not empty
 */
def isNotEmpty(str) {
    return ((str?.trim())? true: false)
}