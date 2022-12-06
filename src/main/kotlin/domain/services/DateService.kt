package domain.services

import java.time.LocalDate

class DateService {
    fun today(): LocalDate = LocalDate.now()
}

fun LocalDate.isSameDayAs(date: LocalDate): Boolean {
    return this.dayOfMonth == date.dayOfMonth && this.month == date.month
}
