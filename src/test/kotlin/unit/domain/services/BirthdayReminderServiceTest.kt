package unit.domain.services

import domain.services.BirthdayReminderService
import domain.services.DateService
import io.mockk.every
import io.mockk.mockk
import io.mockk.spyk
import io.mockk.verify
import org.junit.jupiter.api.Test
import ports.repositories.BirthdayReminderRepository
import ports.services.EmailService
import utils.createBirthdayReminder
import utils.createBirthdayReminderFor
import java.time.LocalDate
import java.time.Month

class BirthdayReminderServiceTest {
    private val birthdayReminderRepository = spyk<BirthdayReminderRepository>()
    private val emailService = spyk<EmailService>()
    private val dateService = mockk<DateService>()

    private val service = BirthdayReminderService(birthdayReminderRepository, emailService, dateService)

    @Test
    fun `a reminder is send to be added`() {
        val reminder = createBirthdayReminder()

        service.add(reminder)

        verify { birthdayReminderRepository.add(reminder) }
    }

    @Test
    fun `a reminder is sent if is someone's birthday`() {
        val date = LocalDate.of(2022, Month.SEPTEMBER, 17)
        val reminder = createBirthdayReminderFor(date.dayOfMonth, date.month)
        every { birthdayReminderRepository.getByBirthday(date) } returns listOf(reminder)
        every { dateService.today() } returns date

        service.checkForReminders()

        verify { emailService.send(reminder) }
    }
}
