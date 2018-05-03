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

    @Test
    void testInfo() throws Exception {
        try {
            script.info()
        } catch (ex) {
            throw ex
        } finally {
            printCallStack()
        }
    }

    @Test
    void testWarning() throws Exception {
        try {
            script.warning()
        } catch (ex) {
            throw ex
        } finally {
            printCallStack()
        }
    }

    @Test
    void testDebug() throws Exception {
        try {
            script.debug()
        } catch (ex) {
            throw ex
        } finally {
            printCallStack()
        }
    }

    @Test
    void testError() throws Exception {
        try {
            script.error()
        } catch (ex) {
            throw ex
        } finally {
            printCallStack()
        }
    }

    @Test
    void testException() throws Exception {
        try {
            script.exception()
        } catch (ex) {
            throw ex
        } finally {
            printCallStack()
        }
    }

}