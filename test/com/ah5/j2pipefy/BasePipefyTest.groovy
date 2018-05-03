#!/usr/bin/env groovy
package com.ah5.j2pipefy
import org.junit.Before
import com.lesfurets.jenkins.unit.BasePipelineTest

abstract class BasePipefyTest extends BasePipelineTest {
    
    def script = null

    void init(scriptRef) {
        if(script == null) {
            script = loadScript(scriptRef)
        }
    }

    @Override
    @Before
    void setUp() throws Exception {
        super.setUp()
    }

}