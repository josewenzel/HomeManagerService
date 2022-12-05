package unit.domain.services

import domain.services.BirthdayService
import io.mockk.mockk
import io.mockk.spyk
import io.mockk.verify
import org.junit.jupiter.api.Test
import ports.repositories.FriendRepository
import ports.services.EmailService
import utils.createFriend

class BirthdayServiceTest {
    private val emailService = mockk<EmailService>()
    private val friendRepository = spyk<FriendRepository>()

    private val service = BirthdayService(emailService, friendRepository)

    @Test
    fun `a friend is send to be added`() {
        val aFriend = createFriend()

        service.addReminderFor(aFriend)

        verify { friendRepository.add(aFriend) }
    }
}
