class DateRange(val start: MyDate, val end: MyDate) {
    operator fun iterator(): Iterator<MyDate> {
        return object : Iterator<MyDate> {
            var current: MyDate = start

            override fun hasNext(): Boolean {
                return current <= end
            }

            override fun next(): MyDate {
                val previous = current
                current = current.nextDay()
                return previous
            }
        }
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}