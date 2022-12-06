package domain.model

class BirthdayReminder(val friend: Friend, val recipient: EmailAddress) {
    fun reminderDate() = friend.birthday
}
