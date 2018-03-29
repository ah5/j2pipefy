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
 * @description returns a display friendly string value
 * @syntax stringefy.getDisplayFriendlyString <str>
 * @usage stringefy.getDisplayFriendlyString "str"
 * 
 * @param str the string to be converted to a display friendly string value
 * @return trimmed and capitalized string value
 */
def getDisplayFriendlyString(str) {
    if(stringefy.isEmpty(str)) logefy.error "stringefy.getDisplayFriendlyString: param str cannot be empty"
    return str.trim().capitalize()
}