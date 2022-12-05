package domain.services

import domain.model.Friend
import ports.repositories.FriendRepository
import ports.services.EmailService

class BirthdayService(val emailService: EmailService, private val friendsRepository: FriendRepository) {
    fun addReminderFor(friend: Friend): Friend {
        friendsRepository.add(friend)
        return friend
    }
}
