package com.lessons.tests.calc

class Calculator {

    fun add(a: Int, b: Int): Int = a + b
    fun subtract(a: Int, b: Int): Int = a - b
    fun multiply(a: Int, b: Int): Int = a * b
    fun divide(a: Int, b: Int): Int = a / b

    fun saveDivide(a: Int, b: Int): Int {
        return if (b != 0) {
            a / b
        } else {
            println("Divide by 0")
            0
        }
    }

    fun evenOrOdd(a: Int): Boolean {
        return a % 2 == 0
    }

}