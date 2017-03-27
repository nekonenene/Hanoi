package com.x0.hatonekoe

import org.junit.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun moveDiscWithCountTest() {
        assertEquals(1,  moveDiscWithCount(1))
        assertEquals(3,  moveDiscWithCount(2))
        assertEquals(7,  moveDiscWithCount(3))
        assertEquals(15, moveDiscWithCount(4))
    }
}
