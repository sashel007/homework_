import java.util.*

fun main() {

    println("Какой картой вы пользуетесь? Введите номер:")
    println("1. Maestro")
    println("2. MasterCard")
    println("3. Visa")
    println("4. МИР")
    println("5. VK Pay")

    var selectedCard = readln().toInt()
    if ((selectedCard < 1) && (selectedCard > 5)) {
        print("Введите номер корректно: ")
        selectedCard = readln().toInt()
    }

    println("Введите сумму предыдущих переводов в этом месяце:")
    val totalSum = readln().toDouble()
    if (totalSum <= 0.0) {
        print("Введите корректную сумму:")
        var totalSum = readln().toDouble()
    }


    println("Введите сумму совершаемого перевода: ")

    val inputAmount = readln().toDouble()
    if (inputAmount <= 0.0) {
        print("Введите корректную сумму:")
        val inputAmount = readln().toDouble()
    }

    println(calculateCommission(selectedCard,totalSum,inputAmount))
}

fun calculateCommission(selectedCard: Int, totalSum: Double, inputAmount: Double) : String {

    val MAX_SUM_ONETIME = 75_000.0
    val MAX_SUM_DAY = 150_000.0
    val MAX_SUM_MONTH = 600_000.0
    val VK_ONETIME_LIMIT = 15_000.0
    val VK_MONTH_LIMIT = 40_000.0
    var commission = 0.0

    var stringCommission = when (selectedCard) {
        1 -> {
            if (inputAmount < MAX_SUM_DAY && (totalSum + inputAmount) < MAX_SUM_MONTH) {
                if (inputAmount + totalSum < MAX_SUM_ONETIME) {
                    commission = 0.0
                    return "Комиссия составляет: ${commission.toInt()}"
                } else {

                }
            } else {
                return "Лимит превышен"
            }
        }

        2 -> {
            if (inputAmount < MAX_SUM_DAY && (totalSum + inputAmount) < MAX_SUM_MONTH) {
                if (inputAmount + totalSum < MAX_SUM_ONETIME) {
                    commission = 0.0
                    return "Комиссия составляет: ${commission.toInt()}"
                } else {

                }
            } else {
                return "Лимит превышен"
            }
        }

        3 -> {
            if (inputAmount < MAX_SUM_DAY && (totalSum + inputAmount) < MAX_SUM_MONTH) {
                if (commission < 35.0) {
                    return "Ваша комиссия составляет: ${(commission).toInt()}"
                } else {

                }
            } else {
                return "Лимит превышен"
            }
        }

        4 -> {
            if (inputAmount < MAX_SUM_DAY && totalSum < MAX_SUM_MONTH) {
                if (commission < 35.0) {
                    return "Ваша комиссия составляет: ${(commission).toInt()}"
                }
                return "Комиссия составляет: ${(commission).toInt()}"
            } else {
                return "Лимит превышен"
            }
        }

        5 -> {
            if (inputAmount < VK_ONETIME_LIMIT && (inputAmount + totalSum) < VK_MONTH_LIMIT) {
                return "Комиссия составялет 0 рублей"
            } else {
                return "Лимит превышен"
            }
        }
        else -> {}
    }
    return stringCommission.toString()
}