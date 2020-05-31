package xyz.mattyb.blns

typealias StrPred = (String) -> Boolean

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

                internal val words = listOf(
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

                @JvmStatic
                fun toCharacterList(): List<String> = alphaNum.values.map { it.toString() }

                @JvmStatic
                fun toWordList(): List<String> = words

                @JvmStatic
                fun randomCharacter(): String = alphaNum.values.random().toString()

                @JvmStatic
                fun randomWord(): String = words.random()

                @JvmStatic
                fun takeWords(num: Int) = IntermediateList(words.take(num))

                @JvmStatic
                fun takeCharacters(num: Int) = IntermediateList(alphaNum.values.map { it.toString() })

                @JvmStatic
                fun dropWords(num: Int) = IntermediateList(words.drop(num))

                @JvmStatic
                fun dropCharacters(num: Int): IntermediateList<String> {
                    return IntermediateList(alphaNum.values.map { it.toString() }.drop(num))
                }

                @JvmStatic
                fun dropLastWords(num: Int) = IntermediateList(words.dropLast(num))

                @JvmStatic
                fun dropLastCharacters(num: Int): IntermediateList<String> {
                    return IntermediateList(alphaNum.values.map { it.toString() }.dropLast(num))
                }

                @JvmStatic
                fun dropWordsWhile(predicate: StrPred) = IntermediateList(words.dropWhile(predicate))

                @JvmStatic
                fun dropCharactersWhile(predicate: StrPred): IntermediateList<String> {
                    return IntermediateList(alphaNum.values.map { it.toString() }.dropWhile(predicate))
                }

                @JvmStatic
                fun pangram() = words.joinToString(" ")
            }

            object Bold {
                internal val all = listOf(
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

                @JvmStatic
                fun toList(): List<String> = all

                @JvmStatic
                fun random(): String = all.random()

                @JvmStatic
                fun take(num: Int) = IntermediateList(all.take(num))

                @JvmStatic
                fun drop(num: Int) = IntermediateList(all.drop(num))

                @JvmStatic
                fun dropLast(num: Int) = IntermediateList(all.dropLast(num))

                @JvmStatic
                fun dropWhile(predicate: StrPred) = IntermediateList(all.dropWhile(predicate))

                @JvmStatic
                @JvmOverloads
                fun joinToString(separator: CharSequence = ", ") = all.joinToString(separator)
            }

            object BoldScript {
                internal val all = listOf(
                        "\uD835\uDCE3\uD835\uDCF1\uD835\uDCEE",
                        "\uD835\uDCFA\uD835\uDCFE\uD835\uDCF2\uD835\uDCEC\uD835\uDCF4"
                )
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
                .plus(Font.Bold.all)
                .plus(Font.BoldScript.all)
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
                "Lightwater Country Park"
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