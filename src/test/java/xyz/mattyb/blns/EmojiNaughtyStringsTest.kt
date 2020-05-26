package xyz.mattyb.blns

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EmojiNaughtyStringsTest {

    @Test
    fun testHasHearts() {
        assertThat(NaughtyStrings.Emoji.Hearts.all())
                .hasSize(15)
    }
}