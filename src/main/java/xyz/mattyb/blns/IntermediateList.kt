package xyz.mattyb.blns

class IntermediateList<T>(private val remaining: List<T>): List<T> {

    override val size = remaining.size

    fun take(num: Int) = IntermediateList(remaining.take(num))

    fun drop(num: Int) = IntermediateList(remaining.drop(num))

    fun dropLast(num: Int) = IntermediateList(remaining.dropLast(num))

    fun dropWhile(predicate: (T) -> Boolean) = IntermediateList(remaining.dropWhile(predicate))

    // Overridden from List
    override fun get(index: Int) = remaining[index]
    override fun indexOf(element: T) = remaining.indexOf(element)
    override fun contains(element: T) = remaining.contains(element)
    override fun containsAll(elements: Collection<T>) = remaining.containsAll(elements)
    override fun isEmpty() = remaining.isEmpty()
    override fun iterator() = remaining.iterator()
    override fun lastIndexOf(element: T) = remaining.lastIndexOf(element)
    override fun listIterator() = remaining.listIterator()
    override fun listIterator(index: Int) = remaining.listIterator(index)
    override fun subList(fromIndex: Int, toIndex: Int) = IntermediateList(remaining.subList(fromIndex, toIndex))

}