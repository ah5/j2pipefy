#!/usr/bin/env groovy
package com.ah5.j2pipefy.unit
import org.junit.Before
import org.junit.Test
import com.lesfurets.jenkins.unit.BasePipelineTest

class TestJob extends BasePipelineTest {

    @Override
    @Before
    void setUp() throws Exception {
        scriptRoots += 'test'
        super.setUp()
    }

    void runScript(scriptRef) throws Exception {
        try {
            def script = loadScript(scriptRef)
            script.execute()
        } catch (ex) {
            throw ex
        } finally {
            printCallStack()
        }
    }

    @Test
    void testEchoNode() throws Exception {
        runScript("workflows/echoNode.jenkins")
    }

    @Test
    void testEchoPipeline() throws Exception {
        runScript("workflows/echoPipeline.jenkins")
    }

}