package ports.repositories

import domain.model.Friend

interface FriendRepository {
    fun add(friend: Friend)
}
