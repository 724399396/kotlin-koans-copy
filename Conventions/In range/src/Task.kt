class DateRange(val start: MyDate, val endInclusive: MyDate) {
    operator fun contains(date: MyDate) = date in start..endInclusive
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}