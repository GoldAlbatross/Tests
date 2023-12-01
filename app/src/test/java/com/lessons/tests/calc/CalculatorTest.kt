package com.lessons.tests.calc

import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class CalculatorTest {
    private lateinit var calc: Calculator

    @Before
    fun setUp() {
        println("start test")
        calc = Calculator()
    }

    @After
    fun tearDown() {
        println("--OK--\n")
    }

    @Test
    fun add() {
        println("add()")
        assertEquals(9, calc.add(6,3))
    }

    @Test
    fun subtract() {
        println("subtract()")
        assertEquals(3, calc.subtract(6,3))
    }

    @Test
    fun multiply() {
        println("multiply()")
        assertEquals(18, calc.multiply(6,3))
    }

    @Test
    fun divide() {
        println("divide()")
        assertEquals(2, calc.divide(6,3))
        assertEquals(0, calc.divide(6,0))
    }
}