import java.util.*

fun <T, C : MutableCollection<T>> Collection<T>.partitionTo(c1: C, c2: C, func: (T) -> Boolean): Pair<C,C> {
    for (element in this) {
        if (func(element))
            c1.add(element)
        else
            c2.add(element)
    }
    return Pair(c1, c2)
}

fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e").
            partitionTo(ArrayList<String>(), ArrayList()) { s -> !s.contains(" ") }
    words == listOf("a", "c")
    lines == listOf("a b", "d e")
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}').
            partitionTo(HashSet<Char>(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z'}
    letters == setOf('a', 'r')
    other == setOf('%', '}')
}