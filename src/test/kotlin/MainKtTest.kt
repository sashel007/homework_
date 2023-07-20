import org.junit.Assert.*
import org.junit.Test

class MainKtTest {

    @Test
    fun testCalculateCommission() {
        val selectedCard = 1
        val totalSum = 20000.0
        val inputAmount = 10000.0

        val result = calculateCommission(
            selectedCard = selectedCard,
            totalSum = totalSum,
            inputAmount = inputAmount
        )

        val expected = "Комиссия составляет: 0"
        assertEquals(expected, result)
    }
}