package com.lessons.tests.calc

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.lang.ArithmeticException

class CalculatorTest {
    private lateinit var calc: Calculator

    @BeforeEach
    fun setUp() {
        print("start: ")
        calc = Calculator()
    }

    @AfterEach
    fun tearDown() {
        println("--OK--\n")
    }

    @Test
    fun add() {
        println("add()")
        val result = calc.add(6,3)
        assertEquals(9, result)
    }

    @Test
    fun subtract() {
        println("subtract()")
        val result = calc.subtract(6,3)
        assertEquals(3, result)
    }

    @Test
    fun multiply() {
        println("multiply()")
        val result = calc.multiply(6,3)
        assertEquals(18, result)
    }

    @Test
    fun saveDivide() {
        println("saveDivide()")
        assertEquals(2, calc.saveDivide(6,3))
        assertEquals(0, calc.saveDivide(6,0))
    }

    @Test
    fun evenOrOdd_evenNumber() {
        println("evenOrOdd_evenNumber()")
        val even = calc.evenOrOdd(10)
        assertTrue(even)
    }

    @Test
    fun evenOrOdd_oddNumber() {
        println("evenOrOdd_oddNumber()")
        val odd = calc.evenOrOdd(9)
        assertFalse(odd)
    }

    @Test
    fun divide() {
        println("divide()")
        assertThrows(ArithmeticException::class.java) { calc.divide(6, 0) }
    }

}