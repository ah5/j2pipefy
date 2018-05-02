#!/usr/bin/env groovy
package com.ah5.j2pipefy.unit
import org.junit.Before
import org.junit.Test
import com.lesfurets.jenkins.unit.BasePipelineTest

class TestJob extends BasePipelineTest {

    def script

    @Override
    @Before
    void setUp() throws Exception {
        scriptRoots += 'test'
        super.setUp()
    }

    @Test
    void testEchoNode() throws Exception {
        script = loadScript("workflows/echoNode.jenkins")
        script.execute()
        printCallStack()
    }

    @Test
    void testEchoPipeline() throws Exception {
        script = loadScript("workflows/echoPipeline.jenkins")
        script.execute()
        printCallStack()
    }

}