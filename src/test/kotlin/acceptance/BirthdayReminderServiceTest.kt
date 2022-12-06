package acceptance

import domain.services.BirthdayReminderService
import domain.services.DateService
import doubles.FakeBirthdayReminderRepository
import io.mockk.every
import io.mockk.mockk
import io.mockk.spyk
import io.mockk.verify
import org.junit.jupiter.api.Test
import ports.services.EmailService
import utils.createBirthdayReminder

class BirthdayReminderServiceTest {
    private val friendsRepository = FakeBirthdayReminderRepository()
    private val emailService = spyk<EmailService>()
    private val dateService = mockk<DateService>()

    private val reminder = createBirthdayReminder()
    private val birthdayReminderService = BirthdayReminderService(friendsRepository, emailService, dateService)

    @Test
    fun `send a reminder of a birthday to the senders on the person's birthday`() {
        every { dateService.today() } returns reminder.friend.birthday

        birthdayReminderService.add(reminder)
        birthdayReminderService.checkForReminders()

        verify {
            emailService.send(reminder)
        }
    }
}
