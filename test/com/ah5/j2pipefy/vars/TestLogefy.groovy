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
        try {
            script.info("message")
        } catch (ex) {
            System.out.println("error calling info.")
        } finally {
            printCallStack()
        }
    }

    //warning ------------------------------------------

    @Test
    void testWarningByStringValue() throws Exception {
        try {
            script.warning("message")
        } catch (ex) {
            System.out.println(ex.getMessage())
        } finally {
            printCallStack()
        }
    }

    //debug ------------------------------------------

    @Test
    void testDebugByStringValue() throws Exception {
        try {
            script.debug("message")
        } catch (ex) {
            System.out.println(ex.getMessage())
        } finally {
            printCallStack()
        }
    }

    //error ------------------------------------------

    @Test
    void testErrorByStringValue() throws Exception {
        try {
            script.error("message")
        } catch (ex) {
            System.out.println(ex.getMessage())
        } finally {
            printCallStack()
        }
    }

    //exception ------------------------------------------

    @Test
    void testExceptionByStringValue() throws Exception {
        try {
            script.exception("message")
        } catch (ex) {
            System.out.println(ex.getMessage())
        } finally {
            printCallStack()
        }
    }

}