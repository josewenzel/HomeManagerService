package doubles

import domain.model.BirthdayReminder
import domain.services.isSameDayAs
import ports.repositories.BirthdayReminderRepository
import java.time.LocalDate
import java.util.LinkedList

class FakeBirthdayReminderRepository : BirthdayReminderRepository {
    private val store = LinkedList<BirthdayReminder>()

    override fun add(birthdayReminder: BirthdayReminder) {
        store.add(birthdayReminder)
    }

    override fun getByBirthday(date: LocalDate): List<BirthdayReminder> {
        return store.filter { birthdayReminder -> birthdayReminder.reminderDate().isSameDayAs(date) }
    }
}
