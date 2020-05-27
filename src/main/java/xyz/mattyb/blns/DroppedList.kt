package xyz.mattyb.blns

class DroppedList<T>(private val remaining: List<T>) {

    fun all() = remaining

    fun take(num: Int) = remaining.take(num)

    fun drop(num: Int) = DroppedList(remaining.drop(num))

    fun dropLast(num: Int) = DroppedList(remaining.dropLast(num))
}