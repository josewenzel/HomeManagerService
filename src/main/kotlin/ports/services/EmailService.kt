package ports.services

import domain.model.BirthdayReminder

interface EmailService {
    fun send(email: BirthdayReminder)
}
