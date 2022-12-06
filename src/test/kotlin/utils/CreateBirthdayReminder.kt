package utils

import domain.model.BirthdayReminder
import domain.model.Friend
import java.time.LocalDate
import java.time.Month

fun createBirthdayReminder(): BirthdayReminder {
    val birthday = LocalDate.of(1993, Month.SEPTEMBER, 17)
    val friend = Friend("Michael Jordan", birthday)
    val recipient = "dummy@example.com"
    return BirthdayReminder(friend, recipient)
}