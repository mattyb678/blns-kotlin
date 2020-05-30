package xyz.mattyb.blns;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JavaEmojiNaughtyStringsTest {

    @Test
    void testHearts() {
        assertThat(NaughtyStrings.Emoji.Hearts.all()).hasSize(15);
        assertThat(NaughtyStrings.Emoji.Hearts.drop(9)).hasSize(6);
        assertThat(NaughtyStrings.Emoji.Hearts.drop(2).drop(9).take(2))
                .containsExactly("\uD83D\uDC9C", "\uD83D\uDC9B");
    }

}