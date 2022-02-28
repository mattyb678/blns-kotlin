package xyz.mattyb.blns

typealias StrPred = (String) -> Boolean

private const val PANGRAM_STR = "The quick brown fox jumps over the lazy dog"

class NaughtyStrings {

    object Emoji {
        object Smileys {
            internal val all = listOf(
                    "\uD83D\uDE00",
                    "\uD83D\uDE0D",
                    "\uD83D\uDE02",
                    "\uD83D\uDE0A",
                    "\uD83D\uDE09",
                    "\uD83D\uDE0B",
                    "\uD83E\uDD11",
                    "\uD83E\uDD10",
                    "\uD83E\uDD28",
                    "\uD83D\uDE44",
                    "\uD83E\uDD15",
                    "\uD83E\uDD76",
                    "\uD83E\uDD13",
                    "\uD83D\uDE41",
                    "\uD83D\uDE30"
            )

            @JvmStatic
            fun toList(): List<String> = all

            @JvmStatic
            fun take(num: Int) = IntermediateList(all.take(num))

            @JvmStatic
            fun drop(num: Int) = IntermediateList(all.drop(num))

            @JvmStatic
            fun dropLast(num: Int) = IntermediateList(all.dropLast(num))

            @JvmStatic
            fun dropWhile(strPred: StrPred) = IntermediateList(all.dropWhile(strPred))

            @JvmStatic
            fun random(): String = all.random()
        }
        object Animals {
            object Monkeys {
                internal val all = listOf(
                        "\uD83D\uDC35",
                        "\uD83D\uDE48",
                        "\uD83D\uDE49",
                        "\uD83D\uDE4A"
                )

                @JvmStatic
                fun toList(): List<String> = all

                @JvmStatic
                fun take(num: Int) = IntermediateList(all.take(num))

                @JvmStatic
                fun drop(num: Int) = IntermediateList(all.drop(num))

                @JvmStatic
                fun dropLast(num: Int) = IntermediateList(all.dropLast(num))

                @JvmStatic
                fun dropWhile(strPred: StrPred) = IntermediateList(all.dropWhile(strPred))

                @JvmStatic
                fun random(): String = all.random()
            }
        }
        object Hearts {
            internal val all = listOf(
                    "❤️",
                    "\uD83D\uDC94",
                    "\uD83D\uDC8C",
                    "\uD83D\uDC95",
                    "\uD83D\uDC9E",
                    "\uD83D\uDC93",
                    "\uD83D\uDC97",
                    "\uD83D\uDC96",
                    "\uD83D\uDC98",
                    "\uD83D\uDC9D",
                    "\uD83D\uDC9F",
                    "\uD83D\uDC9C",
                    "\uD83D\uDC9B",
                    "\uD83D\uDC9A",
                    "\uD83D\uDC99"
            )

            @JvmStatic
            fun toList(): List<String> = all

            @JvmStatic
            fun take(num: Int) = IntermediateList(all.take(num))

            @JvmStatic
            fun drop(num: Int) = IntermediateList(all.drop(num))

            @JvmStatic
            fun dropLast(num: Int)= IntermediateList(all.dropLast(num))

            @JvmStatic
            fun dropWhile(predicate: StrPred) = IntermediateList(all.dropWhile(predicate))

            @JvmStatic
            fun random(): String = all.random()
        }
        object People {
            internal val all = listOf(
                    "\uD83D\uDC76",
                    "\uD83E\uDDD2",
                    "\uD83D\uDC66",
                    "\uD83D\uDC67",
                    "\uD83E\uDDD1",
                    "\uD83D\uDC71",
                    "\uD83D\uDC68",
                    "\uD83E\uDDD4",
                    "\uD83D\uDC69\u200D\uD83E\uDDB3",
                    "\uD83E\uDDD3",
                    "\uD83D\uDE4D",
                    "\uD83E\uDDD1\u200D\uD83E\uDDB0",
                    "\uD83D\uDE4D",
                    "\uD83E\uDDD1\u200D\uD83D\uDE80",
                    "\uD83D\uDC77",
                    "\uD83D\uDC68\u200D\uD83E\uDDB0",
                    "\uD83D\uDC68\uD83C\uDFFF\u200D\uD83E\uDDB0",
                    "\uD83D\uDC68\u200D\uD83E\uDDB1",
                    "\uD83D\uDC68\uD83C\uDFFF\u200D\uD83E\uDDB1",
                    "\uD83E\uDDB9\uD83C\uDFFF\u200D"
            )

            @JvmStatic
            fun toList(): List<String> = all

            @JvmStatic
            fun take(num: Int) = IntermediateList(all.take(num))

            @JvmStatic
            fun drop(num: Int)= IntermediateList(all.drop(num))

            @JvmStatic
            fun dropLast(num: Int) = IntermediateList(all.dropLast(num))

            @JvmStatic
            fun dropWhile(predicate: StrPred) = IntermediateList(all.dropWhile(predicate))

            @JvmStatic
            fun random(): String = all.random()
        }
        object Digits {
            internal val all = listOf(
                    "0️⃣",
                    "1️⃣",
                    "2️⃣",
                    "3️⃣",
                    "4️⃣",
                    "5️⃣",
                    "6️⃣",
                    "7️⃣",
                    "8️⃣",
                    "9️⃣",
                    "\uD83D\uDD1F"
            )

            @JvmStatic
            fun toList(): List<String> = all

            @JvmStatic
            fun take(num: Int)= IntermediateList(all.take(num))

            @JvmStatic
            fun drop(num: Int)= IntermediateList(all.drop(num))

            @JvmStatic
            fun dropLast(num: Int) = IntermediateList(all.dropLast(num))

            @JvmStatic
            fun dropWhile(predicate: StrPred) = IntermediateList(all.dropWhile(predicate))

            @JvmStatic
            fun random(): String = all.random()
        }
        object Signs {
            internal val all = listOf(
                    "\uD83D\uDEBE",
                    "\uD83C\uDD92",
                    "\uD83C\uDD93",
                    "\uD83C\uDD95",
                    "\uD83C\uDD96",
                    "\uD83C\uDD97",
                    "\uD83C\uDD99",
                    "\uD83C\uDFE7"
            )

            @JvmStatic
            fun toList(): List<String> = all

            @JvmStatic
            fun take(num: Int) = IntermediateList(all.take(num))

            @JvmStatic
            fun drop(num: Int) = IntermediateList(all.drop(num))

            @JvmStatic
            fun dropLast(num: Int) = IntermediateList(all.dropLast(num))

            @JvmStatic
            fun dropWhile(predicate: StrPred) = IntermediateList(all.dropWhile(predicate))

            @JvmStatic
            fun random(): String = all.random()
        }
        internal val all = sequenceOf<String>()
                .plus(Animals.Monkeys.all)
                .plus(Hearts.all)
                .plus(Smileys.all)
                .plus(People.all)
                .plus(Digits.all)
                .plus(Signs.all)
                .toList()

        @JvmStatic
        fun take(num: Int) = IntermediateList(all.take(num))

        @JvmStatic
        fun drop(num: Int) = IntermediateList(all.drop(num))

        @JvmStatic
        fun dropLast(num: Int) = IntermediateList(all.dropLast(num))

        @JvmStatic
        fun dropWhile(predicate: StrPred) = IntermediateList(all.dropWhile(predicate))

        @JvmStatic
        fun toList(): List<String> = all

        @JvmStatic
        fun random(): String = all.random()
    }

    object Emoticons {
        internal val all = listOf(
                "ヽ༼ຈل͜ຈ༽ﾉ ヽ༼ຈل͜ຈ༽ﾉ",
                "(｡◕ ∀ ◕｡)",
                "｀ｨ(´∀｀∩",
                "__ﾛ(,_,*)",
                "・(￣∀￣)・:*:",
                "ﾟ･✿ヾ╲(｡◕‿◕｡)╱✿･ﾟ",
                ",。・:*:・゜’( ☻ ω ☻ )。・:*:・゜’",
                "(╯°□°）╯︵ ┻━┻)",
                "(ﾉಥ益ಥ）ﾉ\uFEFF ┻━┻",
                "┬─┬ノ( º _ ºノ)",
                "( ͡° ͜ʖ ͡°)",
                "¯\\_(ツ)_/¯"
        )

        @JvmStatic
        fun toList(): List<String> = all

        @JvmStatic
        fun take(num: Int) = IntermediateList(all.take(num))

        @JvmStatic
        fun drop(num: Int) = IntermediateList(all.drop(num))

        @JvmStatic
        fun dropLast(num: Int) = IntermediateList(all.dropLast(num))

        @JvmStatic
        fun dropWhile(predicate: StrPred) = IntermediateList(all.dropWhile(predicate))

        @JvmStatic
        fun random(): String = all.random()
    }

    object Numeric {
        object Currency {
            object USD {

                @JvmStatic
                fun positive() = IntermediateList(listOf(
                        "\$1.00"
                ))

                @JvmStatic
                fun negative() = IntermediateList(listOf(
                        "-\$1.00"
                ))

                internal val all = sequenceOf<String>()
                        .plus(positive())
                        .plus(negative())
                        .toList()

                @JvmStatic
                fun take(num: Int) = IntermediateList(all.take(num))
            }

            object EUR {

                @JvmStatic
                fun positive() = IntermediateList(listOf(
                        "€1.00"
                ))

                @JvmStatic
                fun negative() = IntermediateList(listOf(
                        "-€1.00"
                ))

                internal val all = sequenceOf<String>()
                        .plus(negative())
                        .plus(positive())
                        .toList()
            }

            internal val all = listOf<String>()
                    .asSequence()
                    .plus(USD.all)
                    .plus(EUR.all)
                    .toList()
        }

        object Fractions {

            @JvmStatic
            fun positive() = IntermediateList(listOf(
                    "1/2"
            ))

            @JvmStatic
            fun negative() = IntermediateList(listOf(
                    "-1/2"
            ))

            internal val all = sequenceOf<String>()
                    .plus(positive())
                    .plus(negative())
                    .toList()
        }

        object Scientific {

            @JvmStatic
            fun positive() = IntermediateList(listOf(
                    "1E2",
                    "1E+02"
            ))

            @JvmStatic
            fun negative() = IntermediateList(listOf(
                    "-1E2",
                    "-1E02",
                    "-1E+02"
            ))

            internal val all = sequenceOf<String>()
                    .plus(positive())
                    .plus(negative())
                    .toList()
        }

        object Hex {
            internal val all = listOf(
                    "0xffffffffffffffff",
                    "0xabad1dea"
            )
        }

        internal val all = sequenceOf<String>()
                .plus(Currency.all)
                .plus(Fractions.all)
                .plus(Scientific.all)
                .plus(Hex.all)
                .toList()

        @JvmStatic
        fun toList(): List<String> = all

        @JvmStatic
        fun take(num: Int) = IntermediateList(all.take(num))

        @JvmStatic
        fun drop(num: Int) = IntermediateList(all.drop(num))

        @JvmStatic
        fun random() = all.random()
    }

    object Unicode {
        object UpsideDown {
            internal val all = listOf(
                    "op",
                    "pǝs",
                    "'ʇᴉlǝ",
                    "ƃuᴉɔsᴉdᴉpɐ",
                    "ɹnʇǝʇɔǝsuoɔ",
                    "'ʇǝɯɐ",
                    "ʇᴉs",
                    "ɹolop",
                    "ɯnsdᴉ",
                    "ɯǝɹo˥",
                    "00˙Ɩ\$-"
            )

            @JvmStatic
            fun toList(): List<String> = all

            @JvmStatic
            fun take(num: Int) = IntermediateList(all.take(num))

            @JvmStatic
            fun drop(num: Int) = IntermediateList(all.drop(num))

            @JvmStatic
            fun dropLast(num: Int) = IntermediateList(all.dropLast(num))

            @JvmStatic
            fun dropWhile(predicate: StrPred) = IntermediateList(all.dropWhile(predicate))

            @JvmStatic
            fun random(): String = all.random()
        }

        object Font {

            object FullWidth {
                private val alphaNum = mapOf(
                        'A' to 'Ａ', 'a' to 'ａ', 'B' to 'Ｂ', 'b' to 'ｂ', 'C' to 'Ｃ',
                        'c' to 'ｃ', 'D' to 'Ｄ', 'd' to 'ｄ', 'E' to 'Ｅ', 'e' to 'ｅ',
                        'F' to 'Ｆ', 'f' to 'ｆ', 'G' to 'Ｇ', 'g' to 'ｇ', 'H' to 'Ｈ',
                        'h' to 'ｈ', 'I' to 'Ｉ', 'i' to 'ｉ', 'J' to 'Ｊ', 'j' to 'ｊ',
                        'K' to 'Ｋ', 'k' to 'ｋ', 'L' to 'Ｌ', 'l' to 'ｌ', 'M' to 'Ｍ',
                        'm' to 'ｍ', 'N' to 'Ｎ', 'n' to 'ｎ', 'O' to 'Ｏ', 'o' to 'ｏ',
                        'P' to 'Ｐ', 'p' to 'ｐ', 'Q' to 'Ｑ', 'q' to 'ｑ', 'R' to 'Ｒ',
                        'r' to 'ｒ', 'S' to 'Ｓ', 's' to 'ｓ', 'T' to 'Ｔ', 't' to 'ｔ',
                        'U' to 'Ｕ', 'u' to 'ｕ', 'V' to 'Ｖ', 'v' to 'ｖ', 'W' to 'Ｗ',
                        'w' to 'ｗ', 'X' to 'Ｘ', 'x' to 'ｘ', 'Y' to 'Ｙ', 'y' to 'ｙ',
                        'Z' to 'Ｚ', 'z' to 'ｚ', '1' to '１', '2' to '２', '3' to '３',
                        '4' to '４', '5' to '５', '6' to '６', '7' to '７', '8' to '８',
                        '9' to '９', '0' to '０'
                )

                @JvmStatic
                fun convert(toConvert: String) = toConvert.map {
                    return@map if (it.isWhitespace()) {
                        it
                    } else {
                        alphaNum[it] ?: "-"
                    }
                }.joinToString("")

                internal val words = PANGRAM_STR.split(" ")
                    .map { convert(it) }

                @JvmStatic
                fun toCharacterList(): List<String> = alphaNum.values.map { it.toString() }

                @JvmStatic
                fun toPangramList(): List<String> = words

                @JvmStatic
                fun randomCharacter(): String = alphaNum.values.random().toString()

                @JvmStatic
                fun randomPangramWord(): String = words.random()

                @JvmStatic
                fun takePangramWords(num: Int) = IntermediateList(words.take(num))

                @JvmStatic
                fun takeCharacters(num: Int) = IntermediateList(alphaNum.values
                    .take(num)
                    .map { it.toString() })

                @JvmStatic
                fun dropPangramWords(num: Int) = IntermediateList(words.drop(num))

                @JvmStatic
                fun dropCharacters(num: Int): IntermediateList<String> {
                    return IntermediateList(alphaNum.values.map { it.toString() }.drop(num))
                }

                @JvmStatic
                fun dropLastPangramWords(num: Int) = IntermediateList(words.dropLast(num))

                @JvmStatic
                fun dropLastCharacters(num: Int): IntermediateList<String> {
                    return IntermediateList(alphaNum.values.map { it.toString() }.dropLast(num))
                }

                @JvmStatic
                fun dropPangramWordsWhile(predicate: StrPred) = IntermediateList(words.dropWhile(predicate))

                @JvmStatic
                fun dropCharactersWhile(predicate: StrPred): IntermediateList<String> {
                    return IntermediateList(alphaNum.values.map { it.toString() }.dropWhile(predicate))
                }

                @JvmStatic
                fun pangram() = words.joinToString(" ")
            }

            object Bold {
                private val alphaNum = mapOf(
                    'A' to "\uD835\uDC00", 'a' to "\uD835\uDC1A", 'B' to "\uD835\uDC01",
                    'b' to "\uD835\uDC1B", 'C' to "\uD835\uDC02", 'c' to "\uD835\uDC1C",
                    'D' to "\uD835\uDC03", 'd' to "\uD835\uDC1D", 'E' to "\uD835\uDC04",
                    'e' to "\uD835\uDC1E", 'F' to "\uD835\uDC05", 'f' to "\uD835\uDC1F",
                    'G' to "\uD835\uDC06", 'g' to "\uD835\uDC20", 'H' to "\uD835\uDC07",
                    'h' to "\uD835\uDC21", 'I' to "\uD835\uDC08", 'i' to "\uD835\uDC22",
                    'J' to "\uD835\uDC09", 'j' to "\uD835\uDC23", 'K' to "\uD835\uDC0A",
                    'k' to "\uD835\uDC24", 'L' to "\uD835\uDC0B", 'l' to "\uD835\uDC25",
                    'M' to "\uD835\uDC0C", 'm' to "\uD835\uDC26", 'N' to "\uD835\uDC0D",
                    'n' to "\uD835\uDC27", 'O' to "\uD835\uDC0E", 'o' to "\uD835\uDC28",
                    'P' to "\uD835\uDC0F", 'p' to "\uD835\uDC29", 'Q' to "\uD835\uDC10",
                    'q' to "\uD835\uDC2A", 'R' to "\uD835\uDC11", 'r' to "\uD835\uDC2B",
                    'S' to "\uD835\uDC12", 's' to "\uD835\uDC2C", 'T' to "\uD835\uDC13",
                    't' to "\uD835\uDC2D", 'U' to "\uD835\uDC14", 'u' to "\uD835\uDC2E",
                    'V' to "\uD835\uDC15", 'v' to "\uD835\uDC2F", 'W' to "\uD835\uDC16",
                    'w' to "\uD835\uDC30", 'X' to "\uD835\uDC17", 'x' to "\uD835\uDC31",
                    'Y' to "\uD835\uDC18", 'y' to "\uD835\uDC32", 'Z' to "\uD835\uDC19",
                    'z' to "\uD835\uDC33", '1' to "\uD835\uDFCF", '2' to "\uD835\uDFD0",
                    '3' to "\uD835\uDFD1", '4' to "\uD835\uDFD2", '5' to "\uD835\uDFD3",
                    '6' to "\uD835\uDFD4", '7' to "\uD835\uDFD5", '8' to "\uD835\uDFD6",
                    '9' to "\uD835\uDFD7", '0' to "\uD835\uDFCE"
                )

                internal val pangram = PANGRAM_STR.split(" ")
                    .map { convert(it) }

                @JvmStatic
                fun convert(toConvert: String) = toConvert.map {
                    return@map if (it.isWhitespace()) {
                        it
                    } else {
                        alphaNum[it] ?: "-"
                    }
                }.joinToString("")

                @JvmStatic
                fun toPangramList(): List<String> = pangram

                @JvmStatic
                fun toCharacterList(): List<String> = alphaNum.values.toList()

                @JvmStatic
                fun randomWord(): String = pangram.random()

                @JvmStatic
                fun randomCharacter(): String = alphaNum.values.random()

                @JvmStatic
                fun takePangramWords(num: Int) = IntermediateList(pangram.take(num))

                @JvmStatic
                fun takeCharacters(num: Int) = IntermediateList(alphaNum.values.take(num))

                @JvmStatic
                fun dropPangramWords(num: Int) = IntermediateList(pangram.drop(num))

                @JvmStatic
                fun dropLastPangramWords(num: Int) = IntermediateList(pangram.dropLast(num))

                @JvmStatic
                fun dropPangramWordsWhile(predicate: StrPred) = IntermediateList(pangram.dropWhile(predicate))

                @JvmStatic
                fun pangram() = pangram.joinToString(" ")
            }

            object BoldScript {
                private val alphaNum = mapOf(
                    'A' to "\uD835\uDCD0", 'a' to "\uD835\uDCEA", 'B' to "\uD835\uDCD1",
                    'b' to "\uD835\uDCEB", 'C' to "\uD835\uDCD2", 'c' to "\uD835\uDCEC",
                    'D' to "\uD835\uDCD3", 'd' to "\uD835\uDCED", 'E' to "\uD835\uDCD4",
                    'e' to "\uD835\uDCEE", 'F' to "\uD835\uDCD5", 'f' to "\uD835\uDCEF",
                    'G' to "\uD835\uDCD6", 'g' to "\uD835\uDCF0", 'H' to "\uD835\uDCD7",
                    'h' to "\uD835\uDCF1", 'I' to "\uD835\uDCD8", 'i' to "\uD835\uDCF2",
                    'J' to "\uD835\uDCD9", 'j' to "\uD835\uDCF3", 'K' to "\uD835\uDCDA",
                    'k' to "\uD835\uDCF4", 'L' to "\uD835\uDCDB", 'l' to "\uD835\uDCF5",
                    'M' to "\uD835\uDCDC", 'm' to "\uD835\uDCF6", 'N' to "\uD835\uDCDD",
                    'n' to "\uD835\uDCF7", 'O' to "\uD835\uDCDE", 'o' to "\uD835\uDCF8",
                    'P' to "\uD835\uDCDF", 'p' to "\uD835\uDCF9", 'Q' to "\uD835\uDCE0",
                    'q' to "\uD835\uDCFA", 'R' to "\uD835\uDCE1", 'r' to "\uD835\uDCFB",
                    'S' to "\uD835\uDCE2", 's' to "\uD835\uDCFC", 'T' to "\uD835\uDCE3",
                    't' to "\uD835\uDCFD", 'U' to "\uD835\uDCE4", 'u' to "\uD835\uDCFE",
                    'V' to "\uD835\uDCE5", 'v' to "\uD835\uDCFF", 'W' to "\uD835\uDCE6",
                    'w' to "\uD835\uDD00", 'X' to "\uD835\uDCE7", 'x' to "\uD835\uDD01",
                    'Y' to "\uD835\uDCE8", 'y' to "\uD835\uDD02", 'Z' to "\uD835\uDCE9",
                    'z' to "\uD835\uDD03"
                )

                internal val pangram = PANGRAM_STR.split(" ")
                    .map { convert(it) }

                @JvmStatic
                fun convert(toConvert: String) = toConvert.map {
                    return@map if (it.isWhitespace()) {
                        it
                    } else {
                        alphaNum[it] ?: "-"
                    }
                }.joinToString("")

                @JvmStatic
                fun toPangramList() = pangram

                @JvmStatic
                fun takePangramWords(num: Int) = IntermediateList(pangram.take(num))

            }

            object Fraktur {
                internal val all = listOf(
                        "\uD835\uDD7F\uD835\uDD8D\uD835\uDD8A",
                        "\uD835\uDD96\uD835\uDD9A\uD835\uDD8E\uD835\uDD88\uD835\uDD90",
                        "\uD835\uDD87\uD835\uDD97\uD835\uDD94\uD835\uDD9C\uD835\uDD93",
                        "\uD835\uDD8B\uD835\uDD94\uD835\uDD9D",
                        "\uD835\uDD8F\uD835\uDD9A\uD835\uDD92\uD835\uDD95\uD835\uDD98",
                        "\uD835\uDD94\uD835\uDD9B\uD835\uDD8A\uD835\uDD97",
                        "\uD835\uDD99\uD835\uDD8D\uD835\uDD8A",
                        "\uD835\uDD91\uD835\uDD86\uD835\uDD9F\uD835\uDD9E",
                        "\uD835\uDD89\uD835\uDD94\uD835\uDD8C"
                )

                @JvmStatic
                fun toList(): List<String> = all

                @JvmStatic
                fun random() = all.random()

                @JvmStatic
                fun take(num: Int) = IntermediateList(all.take(num))

                @JvmStatic
                fun drop(num: Int) = IntermediateList(all.drop(num))

                @JvmStatic
                fun dropWhile(predicate: StrPred) = IntermediateList(all.dropWhile(predicate))

                @JvmStatic
                @JvmOverloads
                fun joinToString(separator: CharSequence = ", ") = all.joinToString(separator)
            }
        }

        internal val all = sequenceOf<String>()
                .plus(UpsideDown.all)
                .plus(Font.FullWidth.words)
                .plus(Font.Bold.pangram)
                .plus(Font.BoldScript.pangram)
                .plus(Font.Fraktur.all)
                .toList()

        @JvmStatic
        fun toList(): List<String> = all

        @JvmStatic
        fun take(num: Int) = IntermediateList(all.take(num))

        @JvmStatic
        fun drop(num: Int) = IntermediateList(all.drop(num))

        @JvmStatic
        fun dropLast(num: Int) = IntermediateList(all.dropLast(num))

        @JvmStatic
        fun dropWhile(strPred: StrPred) = IntermediateList(all.dropWhile(strPred))

        @JvmStatic
        fun random(): String = all.random()
    }

    object Injection {
        object Script {
            internal val all = listOf(
                    "<script>alert(123)</script>",
                    "&lt;script&gt;alert(&#39;123&#39;);&lt;/script&gt;"
            )
        }

        object Sql {
            internal val all = listOf(
                    "1;DROP TABLE users"
            )
        }

        object Server {
            internal val all = listOf(
                    "/dev/null; touch /tmp/blns.fail ; echo"
            )
        }

        internal val all = sequenceOf<String>()
                .plus(Script.all)
                .plus(Sql.all)
                .plus(Server.all)
                .toList()
    }

    object Innocuous {
        internal val all = listOf(
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

        @JvmStatic
        fun random() = all.random()
    }

    companion object {
        private val all = sequenceOf<String>()
                .plus(Emoji.all)
                .plus(Numeric.all)
                .plus(Emoticons.all)
                .plus(Unicode.all)
                .plus(Injection.all)
                .plus(Innocuous.all)
                .toList()

        @JvmStatic
        fun toList(): List<String> = all

        @JvmStatic
        fun take(num: Int) = IntermediateList(all.take(num))

        @JvmStatic
        fun drop(num: Int) = IntermediateList(all.drop(num))

        @JvmStatic
        fun dropLast(num: Int) = IntermediateList(all.dropLast(num))

        @JvmStatic
        fun dropWhile(strPred: StrPred) = IntermediateList(all.dropWhile(strPred))
    }

}
