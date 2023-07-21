import org.junit.Assert.*
import org.junit.Test

class MainKtTest {

    @Test
    fun testCalculateCommission1() {
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

    @Test
    fun testCalculateCommission2() {
        val selectedCard = 2
        val totalSum = 30000.0
        val inputAmount = 5000.0

        val result = calculateCommission(
            selectedCard = selectedCard,
            totalSum = totalSum,
            inputAmount = inputAmount
        )

        val expected = "Комиссия составляет: 0"
        assertEquals(expected, result)
    }

    @Test
    fun testCalculateCommission3() {
        val selectedCard = 3
        val totalSum = 30000.0
        val inputAmount = 5000.0

        val result = calculateCommission(
            selectedCard = selectedCard,
            totalSum = totalSum,
            inputAmount = inputAmount
        )

        val expected = "Ваша комиссия составляет: 375"
        assertEquals(expected, result)
    }

    @Test
    fun testCalculateCommission4() {
        val selectedCard = 4
        val totalSum = 30000.0
        val inputAmount = 5000.0

        val result = calculateCommission(
            selectedCard = selectedCard,
            totalSum = totalSum,
            inputAmount = inputAmount
        )

        val expected = "Ваша комиссия составляет: 375"
        assertEquals(expected, result)
    }

    @Test
    fun testCalculateCommission5() {
        val selectedCard = 5
        val totalSum = 30000.0
        val inputAmount = 5000.0

        val result = calculateCommission(
            selectedCard = selectedCard,
            totalSum = totalSum,
            inputAmount = inputAmount
        )

        val expected = "Комиссия составялет 0 рублей"
        assertEquals(expected, result)
    }

    @Test
    fun testcalculateCommissionReturn1() {
        val selectedCard = 1
        val totalSum = 500_000.0
        val inputAmount = 50_000.0

        val result = calculateCommission(
            selectedCard = selectedCard,
            totalSum = totalSum,
            inputAmount = inputAmount
        )
        val expected = "Лимит превышен"
        assertEquals(expected, result)
    }

    @Test
    fun testcalculateCommissionReturn2() {
        val selectedCard = 2
        val totalSum = 500_000.0
        val inputAmount = 50_000.0

        val result = calculateCommission(
            selectedCard = selectedCard,
            totalSum = totalSum,
            inputAmount = inputAmount
        )
        val expected = "Лимит превышен"
        assertEquals(expected, result)
    }

    @Test
    fun testcalculateCommissionReturn3() {
        val selectedCard = 3
        val totalSum = 700_000.0
        val inputAmount = 10_000.0
        val commission = 40.0

        val result = calculateCommission(
            selectedCard = selectedCard,
            totalSum = totalSum,
            inputAmount = inputAmount,
            commission = commission
        )
        val expected = "Лимит превышен"
        assertEquals(expected, result)
    }

    @Test
    fun testcalculateCommissionReturn4() {
        val selectedCard = 4
        val totalSum = 700_000.0
        val inputAmount = 50_000.0

        val result = calculateCommission(
            selectedCard = selectedCard,
            totalSum = totalSum,
            inputAmount = inputAmount
        )
        val expected = "Лимит превышен"
        assertEquals(expected, result)
    }

    @Test
    fun testcalculateCommissionReturn5() {
        val selectedCard = 5
        val totalSum = 500_000.0
        val inputAmount = 50_000.0

        val result = calculateCommission(
            selectedCard = selectedCard,
            totalSum = totalSum,
            inputAmount = inputAmount
        )
        val expected = "Лимит превышен"
        assertEquals(expected, result)
    }

    @Test
    fun testcalculateCommissionReturn11() {
        val selectedCard = 1
        val totalSum = 700_000.0
        val inputAmount = 2_000.0

        val result = calculateCommission(
            selectedCard = selectedCard,
            totalSum = totalSum,
            inputAmount = inputAmount
        )
        val expected = "Лимит превышен"
        assertEquals(expected, result)
    }
    @Test
    fun testcalculateCommissionReturn22() {
        val selectedCard = 2
        val totalSum = 700_000.0
        val inputAmount = 2_000.0

        val result = calculateCommission(
            selectedCard = selectedCard,
            totalSum = totalSum,
            inputAmount = inputAmount
        )
        val expected = "Лимит превышен"
        assertEquals(expected, result)
    }
    @Test
    fun testcalculateCommissionReturn33() {
        val selectedCard = 3
        val totalSum = 700_000.0
        val inputAmount = 2_000.0

        val result = calculateCommission(
            selectedCard = selectedCard,
            totalSum = totalSum,
            inputAmount = inputAmount
        )
        val expected = "Лимит превышен"
        assertEquals(expected, result)
    }

    @Test
    fun testcalculateCommissionReturn44() {
        val selectedCard = 4
        val totalSum = 700_000.0
        val inputAmount = 2_000.0

        val result = calculateCommission(
            selectedCard = selectedCard,
            totalSum = totalSum,
            inputAmount = inputAmount
        )
        val expected = "Лимит превышен"
        assertEquals(expected, result)
    }

    @Test
    fun testcalculateCommissionReturn55() {
        val selectedCard = 5
        val totalSum = 700_000.0
        val inputAmount = 2_000.0

        val result = calculateCommission(
            selectedCard = selectedCard,
            totalSum = totalSum,
            inputAmount = inputAmount
        )
        val expected = "Лимит превышен"
        assertEquals(expected, result)
    }

}