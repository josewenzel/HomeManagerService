package domain.services

import domain.model.BirthdayReminder
import ports.repositories.BirthdayReminderRepository
import ports.services.EmailService

class BirthdayReminderService(
    private val birthdayReminderRepository: BirthdayReminderRepository,
    private val emailService: EmailService,
    private val dateService: DateService
) {
    fun add(birthdayReminder: BirthdayReminder) {
        birthdayReminderRepository.add(birthdayReminder)
    }

    fun checkForReminders() {
        val todayReminders = birthdayReminderRepository.getByBirthday(dateService.today())
        if (todayReminders.isNotEmpty()) {
            todayReminders.forEach { reminder -> emailService.send(reminder) }
        }
    }
}
