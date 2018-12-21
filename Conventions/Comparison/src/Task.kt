data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        val yearCompare = year - other.year
        if (yearCompare != 0) return yearCompare
        val monthCompare = month - other.month
        if (monthCompare != 0) return monthCompare
        return dayOfMonth - other.dayOfMonth
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2