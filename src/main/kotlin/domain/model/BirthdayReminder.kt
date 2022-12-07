package domain.model

class BirthdayReminder(val friend: Friend, val recipient: List<String>) {
    fun reminderDate() = friend.birthday
}
