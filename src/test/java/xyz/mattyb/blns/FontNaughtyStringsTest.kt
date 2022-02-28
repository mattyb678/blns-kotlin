package xyz.mattyb.blns

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import xyz.mattyb.blns.NaughtyStrings.Unicode.Font

open class FontNaughtyStringsTest {

    @Test
    fun testBoldConvert() {
        assertThat(Font.Bold.convert("Matt"))
            .isEqualTo("\uD835\uDC0C\uD835\uDC1A\uD835\uDC2D\uD835\uDC2D")
    }

    @Test
    fun testBoldPangramList() {
        assertThat(Font.Bold.toPangramList())
            .containsExactly(
                "\uD835\uDC13\uD835\uDC21\uD835\uDC1E",
                "\uD835\uDC2A\uD835\uDC2E\uD835\uDC22\uD835\uDC1C\uD835\uDC24",
                "\uD835\uDC1B\uD835\uDC2B\uD835\uDC28\uD835\uDC30\uD835\uDC27",
                "\uD835\uDC1F\uD835\uDC28\uD835\uDC31",
                "\uD835\uDC23\uD835\uDC2E\uD835\uDC26\uD835\uDC29\uD835\uDC2C",
                "\uD835\uDC28\uD835\uDC2F\uD835\uDC1E\uD835\uDC2B",
                "\uD835\uDC2D\uD835\uDC21\uD835\uDC1E",
                "\uD835\uDC25\uD835\uDC1A\uD835\uDC33\uD835\uDC32",
                "\uD835\uDC1D\uD835\uDC28\uD835\uDC20"
            )
    }

    @Test
    fun testBoldRandomCharacter() {
        for (i in 0..100) {
            assertThat(
                Font.Bold.randomCharacter()
                    .toCharArray()
                    .drop(1)
                    .first()
                    .toInt()
            ).isGreaterThanOrEqualTo(56320)
                .isLessThanOrEqualTo(57303)
        }
    }

    @Test
    fun testBoldRandomPangramWord() {
        for (i in 0..25) {
            assertThat(Font.Bold.randomWord())
                .isIn(
                    "\uD835\uDC13\uD835\uDC21\uD835\uDC1E",
                    "\uD835\uDC2A\uD835\uDC2E\uD835\uDC22\uD835\uDC1C\uD835\uDC24",
                    "\uD835\uDC1B\uD835\uDC2B\uD835\uDC28\uD835\uDC30\uD835\uDC27",
                    "\uD835\uDC1F\uD835\uDC28\uD835\uDC31",
                    "\uD835\uDC23\uD835\uDC2E\uD835\uDC26\uD835\uDC29\uD835\uDC2C",
                    "\uD835\uDC28\uD835\uDC2F\uD835\uDC1E\uD835\uDC2B",
                    "\uD835\uDC2D\uD835\uDC21\uD835\uDC1E",
                    "\uD835\uDC25\uD835\uDC1A\uD835\uDC33\uD835\uDC32",
                    "\uD835\uDC1D\uD835\uDC28\uD835\uDC20"
                )
        }
    }

    @Test
    fun testBoldCharacterList() {
        assertThat(Font.Bold.toCharacterList())
            .hasSize(62)
    }

    @Test
    fun testBoldTakeCharacters() {
        assertThat(Font.Bold.takeCharacters(10))
            .hasSize(10)
            .startsWith("\uD835\uDC00")
            .endsWith("\uD835\uDC1E")
    }

    @Test
    fun testBoldTakePangram() {
        assertThat(Font.Bold.takePangramWords(2))
            .containsExactly(
                "\uD835\uDC13\uD835\uDC21\uD835\uDC1E",
                "\uD835\uDC2A\uD835\uDC2E\uD835\uDC22\uD835\uDC1C\uD835\uDC24"
            )
    }

    @Test
    fun testBoldDropPangram() {
        assertThat(Font.Bold.dropPangramWords(3))
            .hasSize(6)
            .containsExactly(
                "\uD835\uDC1F\uD835\uDC28\uD835\uDC31",
                "\uD835\uDC23\uD835\uDC2E\uD835\uDC26\uD835\uDC29\uD835\uDC2C",
                "\uD835\uDC28\uD835\uDC2F\uD835\uDC1E\uD835\uDC2B",
                "\uD835\uDC2D\uD835\uDC21\uD835\uDC1E",
                "\uD835\uDC25\uD835\uDC1A\uD835\uDC33\uD835\uDC32",
                "\uD835\uDC1D\uD835\uDC28\uD835\uDC20"
            )
    }

    @Test
    fun testBoldDropLastPangram() {
        assertThat(Font.Bold.dropLastPangramWords(4))
            .hasSize(5)
            .containsExactly(
                "\uD835\uDC13\uD835\uDC21\uD835\uDC1E",
                "\uD835\uDC2A\uD835\uDC2E\uD835\uDC22\uD835\uDC1C\uD835\uDC24",
                "\uD835\uDC1B\uD835\uDC2B\uD835\uDC28\uD835\uDC30\uD835\uDC27",
                "\uD835\uDC1F\uD835\uDC28\uD835\uDC31",
                "\uD835\uDC23\uD835\uDC2E\uD835\uDC26\uD835\uDC29\uD835\uDC2C"
            )
    }

    @Test
    fun testBoldPangram() {
        assertThat(Font.Bold.pangram())
            .isEqualTo(
                "\uD835\uDC13\uD835\uDC21\uD835\uDC1E " +
                        "\uD835\uDC2A\uD835\uDC2E\uD835\uDC22\uD835\uDC1C\uD835\uDC24 " +
                        "\uD835\uDC1B\uD835\uDC2B\uD835\uDC28\uD835\uDC30\uD835\uDC27 " +
                        "\uD835\uDC1F\uD835\uDC28\uD835\uDC31 " +
                        "\uD835\uDC23\uD835\uDC2E\uD835\uDC26\uD835\uDC29\uD835\uDC2C " +
                        "\uD835\uDC28\uD835\uDC2F\uD835\uDC1E\uD835\uDC2B " +
                        "\uD835\uDC2D\uD835\uDC21\uD835\uDC1E " +
                        "\uD835\uDC25\uD835\uDC1A\uD835\uDC33\uD835\uDC32 " +
                        "\uD835\uDC1D\uD835\uDC28\uD835\uDC20"
            )
    }

    @Test
    fun testBoldScriptConvert() {
        assertThat(Font.BoldScript.convert("Matt"))
            .isEqualTo("\uD835\uDCDC\uD835\uDCEA\uD835\uDCFD\uD835\uDCFD")
    }

    @Test
    fun testBoldScriptToPangramList() {
        assertThat(Font.BoldScript.toPangramList())
            .hasSize(9)
            .containsExactly(
                "\uD835\uDCE3\uD835\uDCF1\uD835\uDCEE",
                "\uD835\uDCFA\uD835\uDCFE\uD835\uDCF2\uD835\uDCEC\uD835\uDCF4",
                "\uD835\uDCEB\uD835\uDCFB\uD835\uDCF8\uD835\uDD00\uD835\uDCF7",
                "\uD835\uDCEF\uD835\uDCF8\uD835\uDD01",
                "\uD835\uDCF3\uD835\uDCFE\uD835\uDCF6\uD835\uDCF9\uD835\uDCFC",
                "\uD835\uDCF8\uD835\uDCFF\uD835\uDCEE\uD835\uDCFB",
                "\uD835\uDCFD\uD835\uDCF1\uD835\uDCEE",
                "\uD835\uDCF5\uD835\uDCEA\uD835\uDD03\uD835\uDD02",
                "\uD835\uDCED\uD835\uDCF8\uD835\uDCF0"
            )
    }

    @Test
    fun testBoldScriptTakePangram() {
        assertThat(Font.BoldScript.takePangramWords(2))
            .containsExactly(
                "\uD835\uDCE3\uD835\uDCF1\uD835\uDCEE",
                "\uD835\uDCFA\uD835\uDCFE\uD835\uDCF2\uD835\uDCEC\uD835\uDCF4"
            )
    }

    @Test
    fun testFrakturTakePangram() {
        assertThat(Font.Fraktur.take(3))
            .containsExactly(
                "\uD835\uDD7F\uD835\uDD8D\uD835\uDD8A",
                "\uD835\uDD96\uD835\uDD9A\uD835\uDD8E\uD835\uDD88\uD835\uDD90",
                "\uD835\uDD87\uD835\uDD97\uD835\uDD94\uD835\uDD9C\uD835\uDD93"
            )
    }

    @Test
    fun testFrakturDropPangram() {
        assertThat(Font.Fraktur.drop(4))
            .containsExactly(
                "\uD835\uDD8F\uD835\uDD9A\uD835\uDD92\uD835\uDD95\uD835\uDD98",
                "\uD835\uDD94\uD835\uDD9B\uD835\uDD8A\uD835\uDD97",
                "\uD835\uDD99\uD835\uDD8D\uD835\uDD8A",
                "\uD835\uDD91\uD835\uDD86\uD835\uDD9F\uD835\uDD9E",
                "\uD835\uDD89\uD835\uDD94\uD835\uDD8C"
            )
    }

    @Test
    fun testFullWidthPangramList() {
        assertThat(Font.FullWidth.toPangramList())
            .containsExactly(
                "Ｔｈｅ",
                "ｑｕｉｃｋ",
                "ｂｒｏｗｎ",
                "ｆｏｘ",
                "ｊｕｍｐｓ",
                "ｏｖｅｒ",
                "ｔｈｅ",
                "ｌａｚｙ",
                "ｄｏｇ"
            )
    }

    @Test
    fun testFullWidthCharacterList() {
        assertThat(Font.FullWidth.toCharacterList())
            .hasSize(62)
    }

    @Test
    fun testFullWidthRandomCharacter() {
        for (i in 0..50) {
            assertThat(Font.FullWidth.randomCharacter().first().toInt())
                .isGreaterThanOrEqualTo(65296)
                .isLessThanOrEqualTo(65370)
        }
    }

    @Test
    fun testFullWidthRandomPangramWord() {
        for (i in 0..25) {
            assertThat(Font.FullWidth.randomPangramWord())
                .isIn(
                    "Ｔｈｅ",
                    "ｑｕｉｃｋ",
                    "ｂｒｏｗｎ",
                    "ｆｏｘ",
                    "ｊｕｍｐｓ",
                    "ｏｖｅｒ",
                    "ｔｈｅ",
                    "ｌａｚｙ",
                    "ｄｏｇ"
            )
        }
    }

    @Test
    fun testFullWidthTakePangram() {
        assertThat(Font.FullWidth.takePangramWords(4))
            .containsExactly(
                "Ｔｈｅ",
                "ｑｕｉｃｋ",
                "ｂｒｏｗｎ",
                "ｆｏｘ"
            )
    }

    @Test
    fun testFullWidthDropPangram() {
        assertThat(Font.FullWidth.dropPangramWords(4))
            .containsExactly(
                "ｊｕｍｐｓ",
                "ｏｖｅｒ",
                "ｔｈｅ",
                "ｌａｚｙ",
                "ｄｏｇ"
            )
    }

    @Test
    fun testFullWidthDropLastPangram() {
        assertThat(Font.FullWidth.dropLastPangramWords(3))
            .containsExactly(
                "Ｔｈｅ",
                "ｑｕｉｃｋ",
                "ｂｒｏｗｎ",
                "ｆｏｘ",
                "ｊｕｍｐｓ",
                "ｏｖｅｒ"
            )
    }

    @Test
    fun testFullWidthTakeCharacters() {
        assertThat(Font.FullWidth.takeCharacters(5))
            .containsExactly(
                "Ａ",
                "ａ",
                "Ｂ",
                "ｂ",
                "Ｃ"
            )
    }

    @Test
    fun testFullWidthDropCharacters() {
        assertThat(Font.FullWidth.dropCharacters(28))
            .startsWith("Ｏ")
            .endsWith("０")
    }

    @Test
    fun testFullWidthDropLastCharacters() {
        assertThat(Font.FullWidth.dropLastCharacters(15))
            .hasSize(47)
            .startsWith("Ａ")
            .endsWith("Ｘ")
    }

    @Test
    fun testFullWidthPangram() {
        assertThat(Font.FullWidth.pangram())
            .isEqualTo(
                "Ｔｈｅ ｑｕｉｃｋ ｂｒｏｗｎ ｆｏｘ ｊｕｍｐｓ ｏｖｅｒ ｔｈｅ ｌａｚｙ ｄｏｇ"
            )
    }

}
