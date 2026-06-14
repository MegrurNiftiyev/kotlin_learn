package com.megrur.niftiyev.Functions

fun functions() {
    println("=======functions ========")

    println(power(2, 3))
    println(power(2.5, 3))
    println(singleExp(4, 5))
    println(arraySumer(1, 2, 3, 4))
    println(multiplication(intArrayOf(2, 3, 4)))
    println(divide(10, 2))
    println(arrayCalculator(1, 2, 3, operator = '+'))
    println(arrayCalculator(10, 2, 3, operator = '-'))
    println(arrayCalculator(2, 3, 4, operator = '*'))

    listOf(
        "Pass123!",
        "pass123!",
        "Password!",
        "Password123",
        "Pa1!"
    ).forEach { it.IsValidPssswordExtension() }
}

fun power(value: Int, n: Int): Long {
    var reasult: Long = 1
    for (i in 1..n) {
        reasult *= value
    }
    return reasult
}

fun power(value: Double, n: Int): Double {
    var reasult: Double = 1.0
    for (i in 1..n) {
        reasult *= value
    }
    return reasult
}


fun singleExp(num1: Int, num2: Int) = num1 * num2

fun arraySumer(vararg numbers: Int): Int {
    return numbers.sum()
}

fun multiplication(array: IntArray): Int {
    var bucek = 1
    for (i in array) {
        bucek *= i
    }
    return bucek
}

fun divide(value1: Int, value2: Int): Double {
    if (value2 == 0)
        return Double.NaN
    return value1 / value2.toDouble()
}

fun arrayCalculator(vararg numbers: Int, operator: Char): Int {
    var resault = 0
    when (operator) {
        '+' -> resault = numbers.sum()
        '-' -> resault = numbers[0] - numbers.sliceArray(
            1..numbers.lastIndex
        ).sum()

        '*' -> resault = multiplication(numbers)

        else -> println("Invalid operator")
    }
    return resault
}

fun String.IsValidPssswordExtension(
    isContainUppercase: Boolean = true,
    isContainNumber: Boolean = true,
    isContainSpacelChar: Boolean = true,
    minCharacter: Int = 8
): Boolean {
    if (this.length < minCharacter) {
        println("chracter is must be longr than ${minCharacter}")
        return false
    }
    if (isContainNumber) {
        var isContein = false
        for (i in this) {
            if (i.isDigit()) {
                isContein = true
                break
            }

        }
        if (!isContein) {
            println("not contains number")
            return false
        }

    }
    if (isContainUppercase) {
        var isContein = false
        for (i in this) {
            if (i.isUpperCase()) {
                isContein = true
                break
            }

        }
        if (!isContein) {
            println("not contains upper case")
            return false
        }
    }

    if (isContainSpacelChar) {
        var isContain = this.any { !it.isLetterOrDigit() && !it.isWhitespace() }
        if (!isContain) {
            println("not contains spacel chracter")

            return false
        }
    }
    println("password is valid")
    return true
}

