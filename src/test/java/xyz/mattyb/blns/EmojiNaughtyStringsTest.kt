package xyz.mattyb.blns

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

open class EmojiNaughtyStringsTest {

    @Test
    fun testSmileys() {
        assertThat(NaughtyStrings.Emoji.Smileys.all()).hasSize(15)
        assertThat(NaughtyStrings.Emoji.Smileys.take(2))
                .containsExactly("\uD83D\uDE00", "\uD83D\uDE0D")
        assertThat(NaughtyStrings.Emoji.Smileys.drop(7).take(2))
                .containsExactly("\uD83E\uDD10", "\uD83E\uDD28")
    }

    @Test
    fun testHearts() {
        assertThat(NaughtyStrings.Emoji.Hearts.all()).hasSize(15)
        assertThat(NaughtyStrings.Emoji.Hearts.take(3))
                .containsExactly("❤️", "\uD83D\uDC94", "\uD83D\uDC8C")
        assertThat(NaughtyStrings.Emoji.Hearts.drop(10).take(2))
                .containsExactly("\uD83D\uDC9F", "\uD83D\uDC9C")
        assertThat(NaughtyStrings.Emoji.Hearts.random()).isNotNull()
    }
}