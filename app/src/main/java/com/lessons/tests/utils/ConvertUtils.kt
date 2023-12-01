package com.lessons.tests.utils

object ConvertUtils {

    fun stringToInteger(s: String): Int {
        var result = 0

        try {
            result = s.toInt()
        } catch (e: NumberFormatException) {
            e.printStackTrace()
        }
        return result
    }

}