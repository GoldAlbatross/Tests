package com.lessons.tests.utils

import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher

class ShortStringMatcher(
    private val length: Int
) : TypeSafeMatcher<String?>() {

    override fun describeTo(description: Description) {
        description.appendText("Length of string must be shorter than $length")
    }

    override fun matchesSafely(item: String?): Boolean {
        return (item?.length ?: 0) < length
    }

}

fun isShortString(limit: Int): Matcher<String?> {
    return ShortStringMatcher(limit)
}