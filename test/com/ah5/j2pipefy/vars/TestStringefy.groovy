#!/usr/bin/env groovy
package com.ah5.j2pipefy.vars
import com.ah5.j2pipefy.BasePipefyTest
import org.junit.Before
import org.junit.Test
import org.junit.Assert

class TestStringefy extends BasePipefyTest {

    @Override
    @Before
    void setUp() throws Exception {
        super.setUp()
        init("workflows/vars.stringefy.jenkins")
    }

    //isEmpty ------------------------------------------

    @Test
    void testIsEmptyByStringValue() throws Exception {
        script.isEmpty("message")
    }

    @Test
    void testIsEmptyByNullValue() throws Exception {
        script.isEmpty(null)
    }

    @Test
    void testIsEmptyByEmptyValue() throws Exception {
        script.isEmpty("")
    }

    //isNotEmpty ------------------------------------------

    @Test
    void testIsNotEmptyByStringValue() throws Exception {
        script.isNotEmpty("message")
    }

    @Test
    void testIsNotEmptyByNullValue() throws Exception {
        script.isNotEmpty(null)
    }

    @Test
    void testIsNotEmptyByEmptyValue() throws Exception {
        script.isNotEmpty("")
    }

    //isInteger ------------------------------------------

    @Test
    void testIsIntegerByStringValue() throws Exception {
        script.isInteger("message")
    }

    @Test
    void testIsIntegerByNullValue() throws Exception {
        script.isInteger(null)
    }

    @Test
    void testIsIntegerByIntegerValue() throws Exception {
        script.isInteger(new Integer(1))
    }

}