package xyz.mattyb.blns

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

open class InnocuousNaughtyStringsTest {

    @Test
    fun testRandom() {
        for (i in 0..50) {
            assertThat(NaughtyStrings.Innocuous.random())
                .isIn(
                    "Scunthorpe General Hospital",
                    "Penistone Community Church",
                    "Lightwater Country Park",
                    "Jimmy Clitheroe",
                    "Horniman Museum",
                    "shitake mushrooms",
                    "RomansInSussex.co.uk",
                    "http://www.cum.qc.ca/",
                    "Craig Cockburn, Software Specialist",
                    "Linda Callahan",
                    "Dr. Herman I. Libshitz",
                    "magna cum laude",
                    "Super Bowl XXX",
                    "medieval erection of parapets",
                    "Dick Van Dyke"
                )
        }
    }
}