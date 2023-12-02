package com.lessons.tests.convertors

import com.lessons.tests.utils.isShortString
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConvertUtilsTest {

    @Test
    fun stringToInteger() {
        assertEquals(2, ConvertUtils.stringToInteger("2"))
        assertEquals(-2, ConvertUtils.stringToInteger("-2"))
        assertEquals(0, ConvertUtils.stringToInteger(""))
        assertEquals(0, ConvertUtils.stringToInteger("a"))
    }
    @Test
    fun normalSize () {
        MatcherAssert.assertThat("", isShortString(7))
    }

}