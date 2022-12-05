package utils

import domain.model.Friend
import java.time.LocalDate
import java.time.Month

fun createFriend(): Friend {
    val birthday = LocalDate.of(1993, Month.SEPTEMBER, 17)
    return Friend("Michael Jordan", birthday)
}
