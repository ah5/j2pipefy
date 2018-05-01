#!/usr/bin/env groovy
package com.ah5.j2pipefy.tool
import groovy.transform.Field

@Field def LOGGER = "com.ah5.j2pipefy.tool.Docker"

/**
 * @description runs version command
 */
def version() {
    logefy.info "${LOGGER}:version: Running version ..."
    this.run("version")
}

/**
 * @description runs command string
 *
 * @param commandStr the command to run
 */
def run(commandStr) {
    logefy.info "${LOGGER}:run: Running command ..."
    if(stringefy.isEmpty(commandStr)) logefy.error "${LOGGER}:run: Param commandStr cannot be empty."
    try {
        sh "${valuefy.DOCKER_COMMAND} ${commandStr}"
    } catch (ex) {
        logefy.debug "${LOGGER}:run: Running ${valuefy.DOCKER_COMMAND} command failed !"
        logefy.exception(ex)
    }
}