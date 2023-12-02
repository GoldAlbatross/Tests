package com.lessons.tests.convertors

object ConvertUtils {

    fun stringToInteger(s: String): Int {
        var result = 0

        try {
            if (normalSize(s)) {
                result = s.toInt()
            }
        } catch (e: NumberFormatException) {
            e.printStackTrace()
        }
        return result
    }

    fun normalSize (s: String): Boolean {
        return s.length <= 10
    }

}