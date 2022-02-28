package xyz.mattyb.blns

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

open class IntermediateListTest {

    @Test
    fun testEmpty() {
        val empty = IntermediateList(listOf<String>())
        assertThat(empty)
            .isEmpty()
    }

    @Test
    fun testSingle() {
        val single = IntermediateList(listOf("hello"))
        assertThat(single)
            .hasSize(1)
            .isNotEmpty()
            .doesNotContain("other")
        assertThat(single.contains("hello"))
            .isTrue()
        assertThat(single.take(10))
            .containsExactly("hello")
        assertThat(single.takeLast(10))
            .containsExactly("hello")
        assertThat(single[0])
            .isEqualTo("hello")
        assertThat(single.indexOf("hello"))
            .isEqualTo(0)
        assertThat(single.indexOf("other"))
            .isEqualTo(-1)
        assertThat(single.drop(5))
            .isEmpty()
        assertThat(single.dropLast(5))
            .isEmpty()
    }

    @Test
    fun testMultiple() {
        val multiple = IntermediateList((0..25).toList())
        assertThat(multiple)
            .hasSize(26)
            .contains(1, 10, 24)
            .doesNotContain(1776, 26, -1)
        assertThat(multiple.dropWhile { it < 10 })
            .hasSize(16)
            .doesNotContain(1, 2, 4)
        assertThat(multiple.containsAll((10..25).toList()))
            .isTrue()
    }

}