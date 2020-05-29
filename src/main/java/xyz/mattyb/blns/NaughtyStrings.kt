package xyz.mattyb.blns

typealias StrPred = (String) -> Boolean

class NaughtyStrings {

    object Emoji {
        object Smileys {
            private val all = listOf(
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
            fun all(): List<String> = all

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
                private val all = listOf(
                        "\uD83D\uDC35",
                        "\uD83D\uDE48",
                        "\uD83D\uDE49",
                        "\uD83D\uDE4A"
                )

                @JvmStatic
                fun all(): List<String> = all

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
            private val all = listOf(
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
            fun all(): List<String> = all

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
            private val all = listOf(
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
            fun all(): List<String> = all

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
            private val all = listOf(
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
            fun all(): List<String> = all

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
            private val all = listOf(
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
            fun all(): List<String> = all

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
        private val all = listOf<String>()
                .asSequence()
                .plus(Animals.Monkeys.all())
                .plus(Hearts.all())
                .plus(Smileys.all())
                .plus(People.all())
                .plus(Digits.all())
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
        fun all(): List<String> = all

        @JvmStatic
        fun random(): String = all.random()
    }

    object Emoticons {
        private val all = listOf(
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
        fun all(): List<String> = all

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
        @JvmStatic
        fun all(): List<String> {
            TODO("Not yet implemented")
        }

        @JvmStatic
        fun take(num: Int): List<String> {
            TODO("Not yet implemented")
        }

        @JvmStatic
        fun random(): String {
            TODO("Not yet implemented")
        }

        @JvmStatic
        fun drop(num: Int): IntermediateList<String> = TODO("Not yet implemented")
    }

    object Unicode {
        object UpsideDown {
            private val all = listOf(
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
            fun all(): List<String> = all

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
                private val all = listOf(
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
                fun all(): List<String> = all

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

            object Bold {
                private val all = listOf(
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
                fun all(): List<String> = all

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
        }

        private val all = listOf<String>()
                .plus(UpsideDown.all())
                .plus(Font.FullWidth.all())
                .plus(Font.Bold.all())

        @JvmStatic
        fun all(): List<String> = all

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

    companion object {
        private val all = listOf<String>()
                .asSequence()
                .plus(Emoji.all())
                .plus(Emoticons.all())
                .plus(Unicode.all())
                .toList()

        @JvmStatic
        fun all(): List<String> = all

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