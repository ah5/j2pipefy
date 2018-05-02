#!/usr/bin/env groovy
package com.ah5.j2pipefy.unit
import org.junit.Test
import com.lesfurets.jenkins.unit.BasePipelineTest

class TestJob extends BasePipelineTest {

    @Test
    void testLogefy() throws Exception {
        def script = loadScript("workflows/logefyJob.jenkins")
        script.execute()
        //printCallStack()
    }

}