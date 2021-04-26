package com.example.testingkotlin

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Assert
import org.junit.Test

class TestArithmetic {
    private lateinit var arithmetic : Arithmetic
    @Test
    fun testAdd(){
        arithmetic = Arithmetic()

        val expectedResult = 5
        arithmetic.first = 2
        arithmetic.second = 3

        val actualResult = arithmetic.add()
        Assert.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun testSub(){
        arithmetic = Arithmetic()

        val expectedResult = -1
        arithmetic.first = 2
        arithmetic.second = 3

        val actualResult = arithmetic.subtract()
        Assert.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun testEvenNumber(){
        arithmetic = Arithmetic()

        val actualResult = arithmetic.checkEven(4)
        assertTrue(actualResult)
    }
}