package ports.repositories

import domain.model.BirthdayReminder
import java.time.LocalDate

interface BirthdayReminderRepository {
    fun add(birthdayReminder: BirthdayReminder)
    fun getByBirthday(date: LocalDate): List<BirthdayReminder>
}
