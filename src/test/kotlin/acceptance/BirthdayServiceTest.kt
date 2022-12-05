package acceptance

import domain.services.BirthdayService
import doubles.FakeFriendRepository
import io.mockk.mockk
import org.junit.jupiter.api.Test
import ports.services.EmailService
import strikt.api.expectThat
import strikt.assertions.isEqualTo
import utils.createFriend

class BirthdayServiceTest {
    private val friendsRepository = FakeFriendRepository()
    private val emailService = mockk<EmailService>()

    @Test
    fun `a friend's birthday can be added to be reminded of`() {
        val birthdayService = BirthdayService(emailService, friendsRepository)
        val friend = createFriend()

        val response = birthdayService.addReminderFor(friend)

        expectThat(response).isEqualTo(friend)
    }
}
