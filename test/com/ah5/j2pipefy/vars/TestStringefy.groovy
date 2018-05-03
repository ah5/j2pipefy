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
        try {
            script.isEmpty("message")
        } catch (ex) {
            System.out.println(ex.getMessage())
        } finally {
            printCallStack()
        }
    }

    @Test
    void testIsEmptyByNullValue() throws Exception {
        try {
            script.isEmpty(null)
        } catch (ex) {
            System.out.println(ex.getMessage())
        } finally {
            printCallStack()
        }
    }

    @Test
    void testIsEmptyByEmptyValue() throws Exception {
        try {
            script.isEmpty("")
        } catch (ex) {
            System.out.println(ex.getMessage())
        } finally {
            printCallStack()
        }
    }

    //isNotEmpty ------------------------------------------

    @Test
    void testIsNotEmptyByStringValue() throws Exception {
        try {
            script.isNotEmpty("message")
        } catch (ex) {
            System.out.println(ex.getMessage())
        } finally {
            printCallStack()
        }
    }

    @Test
    void testIsNotEmptyByNullValue() throws Exception {
        try {
            script.isNotEmpty(null)
        } catch (ex) {
            System.out.println(ex.getMessage())
        } finally {
            printCallStack()
        }
    }

    @Test
    void testIsNotEmptyByEmptyValue() throws Exception {
        try {
            script.isNotEmpty("")
        } catch (ex) {
            System.out.println(ex.getMessage())
        } finally {
            printCallStack()
        }
    }

    //isInteger ------------------------------------------

    @Test
    void testIsIntegerByStringValue() throws Exception {
        try {
            script.isInteger("message")
        } catch (ex) {
            System.out.println(ex.getMessage())
        } finally {
            printCallStack()
        }
    }

    @Test
    void testIsIntegerByNullValue() throws Exception {
        try {
            script.isInteger(null)
        } catch (ex) {
            System.out.println(ex.getMessage())
        } finally {
            printCallStack()
        }
    }

    @Test
    void testIsIntegerByIntegerValue() throws Exception {
        try {
            script.isInteger(new Integer(1))
        } catch (ex) {
            System.out.println(ex.getMessage())
        } finally {
            printCallStack()
        }
    }

}