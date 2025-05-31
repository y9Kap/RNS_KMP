package io.github.kotlin.fibonacci

import kotlin.test.Test
import kotlin.test.assertEquals

class MingwFibiTest {

    @Test
    fun `test 4rd element`() {
        assertEquals(13, generateFibi().take(3).last())
    }
}