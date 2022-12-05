import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isTrue

class DummyTest {
    @Test
    fun `that pass`() {
        expectThat(true).isTrue()
    }
}
