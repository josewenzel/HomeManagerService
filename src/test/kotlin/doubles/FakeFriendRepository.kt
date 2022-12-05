package doubles

import domain.model.Friend
import ports.repositories.FriendRepository
import java.util.LinkedList

class FakeFriendRepository : FriendRepository {
    private val store = LinkedList<Friend>()

    override fun add(friend: Friend) {
        store.add(friend)
    }
}
