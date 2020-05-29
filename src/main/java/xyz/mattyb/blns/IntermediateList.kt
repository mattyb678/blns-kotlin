package xyz.mattyb.blns

class IntermediateList<T>(private val remaining: List<T>) {

    fun all() = remaining

    fun take(num: Int) = IntermediateList(remaining.take(num))

    fun drop(num: Int) = IntermediateList(remaining.drop(num))

    fun dropLast(num: Int) = IntermediateList(remaining.dropLast(num))
}