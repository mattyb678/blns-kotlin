package xyz.mattyb.blns

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

open class FontNaughtyStringsTest {

    @Test
    fun testBoldConvert() {
        assertThat(NaughtyStrings.Unicode.Font.Bold.convert("Matt"))
            .isEqualTo("\uD835\uDC0C\uD835\uDC1A\uD835\uDC2D\uD835\uDC2D")
    }

    @Test
    fun testBoldCharacterList() {
        assertThat(NaughtyStrings.Unicode.Font.Bold.toCharacterList())
            .hasSize(62)
    }

    @Test
    fun testBoldTakePangram() {
        assertThat(NaughtyStrings.Unicode.Font.Bold.takePangramWords(2))
            .containsExactly("\uD835\uDC13\uD835\uDC21\uD835\uDC1E",
                "\uD835\uDC2A\uD835\uDC2E\uD835\uDC22\uD835\uDC1C\uD835\uDC24")
    }

}