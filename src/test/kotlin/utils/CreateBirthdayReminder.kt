package utils

import domain.model.BirthdayReminder
import domain.model.Friend
import java.time.LocalDate
import java.time.Month

fun createBirthdayReminder(): BirthdayReminder {
    val birthday = LocalDate.of(1993, Month.SEPTEMBER, 17)
    val friend = Friend("Michael Jordan", birthday)
    val recipient = listOf("dummy@example.com", "dummy2@example.com")
    return BirthdayReminder(friend, recipient)
}

fun createBirthdayReminderFor(day: Int, month: Month): BirthdayReminder {
    val birthday = LocalDate.of(day, month, 17)
    val friend = Friend("Michael Jordan", birthday)
    val recipient = listOf("dummy@example.com", "dummy2@example.com")
    return BirthdayReminder(friend, recipient)
}
