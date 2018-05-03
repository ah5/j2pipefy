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

/**
 * @description checks if string is integer
 * @syntax stringefy.isInteger <str>
 * @usage stringefy.isInteger "str"
 * 
 * @param str the string to be verified
 * @return true if it is an integer
 */
def isInteger(str) {
    try {
        int value = str as Integer
        isInt = true
    } catch (Exception ex) {
        error "stringefy.isInteger: " + ex.getMessage()
        isInt = false
    }
    return isInt
}

return this