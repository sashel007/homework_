import org.junit.Assert.*
import org.junit.Test

class MainKtTest {

    @Test
    fun calculateCommission() {
        val selectedCard = 1
        val totalSum = 20000.0
        val inputAmount = 10000.0

        val result = calculateCommission(
            selectedCard = selectedCard,
            totalSum = totalSum,
            inputAmount = inputAmount
        )

        val printedValue = result.toString().trim()

        assertEquals("Комиссия составляет: 0", printedValue)
    }
}