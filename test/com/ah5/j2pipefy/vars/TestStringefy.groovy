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
        init("workflows/vars.stringefy.jenkins")
    }

    @Test
    void testIsEmpty() throws Exception {
        try {
            script.isEmpty()
        } catch (ex) {
            throw ex
        } finally {
            printCallStack()
        }
    }

    @Test
    void testIsNotEmpty() throws Exception {
        try {
            script.isNotEmpty()
        } catch (ex) {
            throw ex
        } finally {
            printCallStack()
        }
    }

}