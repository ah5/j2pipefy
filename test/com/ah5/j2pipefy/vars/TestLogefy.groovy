#!/usr/bin/env groovy
package com.ah5.j2pipefy.vars
import com.ah5.j2pipefy.BasePipefyTest
import org.junit.Before
import org.junit.Test
import org.junit.Assert

class TestLogefy extends BasePipefyTest {

    @Override
    @Before
    void setUp() throws Exception {
        super.setUp()
        init("workflows/vars.logefy.jenkins")
    }

    //info ------------------------------------------

    @Test
    void testInfoByStringValue() throws Exception {
        script.info("message")
    }

    //warning ------------------------------------------

    @Test
    void testWarningByStringValue() throws Exception {
        script.warning("message")
    }

    //debug ------------------------------------------

    @Test
    void testDebugByStringValue() throws Exception {
        script.debug("message")
    }

    //error ------------------------------------------

    @Test
    void testErrorByStringValue() throws Exception {
        script.error("message")
    }

    //exception ------------------------------------------

    @Test
    void testExceptionByStringValue() throws Exception {
        script.exception("message")
    }

}