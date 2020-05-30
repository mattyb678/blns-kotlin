package xyz.mattyb.blns

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

open class EmojiNaughtyStringsTest {

    @Test
    fun testAll() {
        assertThat(NaughtyStrings.Emoji.asList()).hasSize(73)
        assertThat(NaughtyStrings.Emoji.take(2))
                .containsExactly("\uD83D\uDC35", "\uD83D\uDE48")
        assertThat(NaughtyStrings.Emoji.drop(50).take(3))
                .containsExactly("\uD83D\uDC68\uD83C\uDFFF\u200D\uD83E\uDDB0",
                        "\uD83D\uDC68\u200D\uD83E\uDDB1",
                        "\uD83D\uDC68\uD83C\uDFFF\u200D\uD83E\uDDB1")
        assertThat(NaughtyStrings.Emoji.random()).isNotBlank()
    }

    @Test
    fun testSmileys() {
        assertThat(NaughtyStrings.Emoji.Smileys.asList()).hasSize(15)
        assertThat(NaughtyStrings.Emoji.Smileys.take(2))
                .containsExactly("\uD83D\uDE00", "\uD83D\uDE0D")
        assertThat(NaughtyStrings.Emoji.Smileys.drop(7).take(2))
                .containsExactly("\uD83E\uDD10", "\uD83E\uDD28")
        assertThat(NaughtyStrings.Emoji.Smileys.dropLast(13)).hasSize(2)
        assertThat(NaughtyStrings.Emoji.Smileys.dropLast(13))
                .containsExactly("\uD83D\uDE00", "\uD83D\uDE0D")
        assertThat(NaughtyStrings.Emoji.Smileys.random()).isNotBlank()
    }

    @Test
    fun testMonkeys() {
        assertThat(NaughtyStrings.Emoji.Animals.Monkeys.asList()).hasSize(4)
        assertThat(NaughtyStrings.Emoji.Animals.Monkeys.take(2))
                .containsExactly("\uD83D\uDC35", "\uD83D\uDE48")
        assertThat(NaughtyStrings.Emoji.Animals.Monkeys.drop(1).take(2))
                .containsExactly("\uD83D\uDE48", "\uD83D\uDE49")
        assertThat(NaughtyStrings.Emoji.Animals.Monkeys.random()).isNotBlank()
    }

    @Test
    fun testPeople() {
        assertThat(NaughtyStrings.Emoji.People.asList()).hasSize(20)
        assertThat(NaughtyStrings.Emoji.People.take(3))
                .containsExactly("\uD83D\uDC76", "\uD83E\uDDD2", "\uD83D\uDC66")
        assertThat(NaughtyStrings.Emoji.People.drop(10).take(2))
                .containsExactly("\uD83D\uDE4D", "\uD83E\uDDD1\u200D\uD83E\uDDB0")
        assertThat(NaughtyStrings.Emoji.People.random()).isNotBlank()
    }

    @Test
    fun testDigits() {
        assertThat(NaughtyStrings.Emoji.Digits.asList()).hasSize(11)
        assertThat(NaughtyStrings.Emoji.Digits.take(2))
                .containsExactly("0️⃣", "1️⃣")
        assertThat(NaughtyStrings.Emoji.Digits.drop(6).take(2))
                .containsExactly("6️⃣", "7️⃣")
        assertThat(NaughtyStrings.Emoji.Digits.random()).isNotBlank()
    }

    @Test
    fun testSigns() {
        assertThat(NaughtyStrings.Emoji.Signs.asList()).hasSize(8)
        assertThat(NaughtyStrings.Emoji.Signs.take(2))
                .containsExactly("\uD83D\uDEBE", "\uD83C\uDD92")
        assertThat(NaughtyStrings.Emoji.Signs.drop(7).take(2))
                .containsExactly("\uD83C\uDFE7")
        assertThat(NaughtyStrings.Emoji.Signs.random()).isNotBlank()
    }

    @Test
    fun testHearts() {
        assertThat(NaughtyStrings.Emoji.Hearts.asList()).hasSize(15)
        assertThat(NaughtyStrings.Emoji.Hearts.take(3))
                .containsExactly("❤️", "\uD83D\uDC94", "\uD83D\uDC8C")
        assertThat(NaughtyStrings.Emoji.Hearts.drop(10).take(2))
                .containsExactly("\uD83D\uDC9F", "\uD83D\uDC9C")
        assertThat(NaughtyStrings.Emoji.Hearts.random()).isNotBlank()
    }
}