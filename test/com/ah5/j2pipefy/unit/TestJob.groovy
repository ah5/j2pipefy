#!/usr/bin/env groovy
package com.ah5.j2pipefy.unit
import com.lesfurets.jenkins.unit.BasePipelineTest

class TestJob extends BasePipelineTest {

    @Test
    void should_execute_without_errors() throws Exception {
        def script = loadScript("workflows/exampleJob.jenkins")
        script.execute()
        printCallStack()
    }

}