#!/usr/bin/env groovy
package com.ah5.j2pipefy.unit
import org.junit.Before
import org.junit.Test
import com.lesfurets.jenkins.unit.BasePipelineTest

class TestJob extends BasePipelineTest {

    @Override
    @Before
    void setUp() throws Exception {
        super.setUp()
    }

    @Test
    void testEcho() throws Exception {
        def script = loadScript("workflows/echoJob.jenkins")
        script.execute()
        printCallStack()
    }

}