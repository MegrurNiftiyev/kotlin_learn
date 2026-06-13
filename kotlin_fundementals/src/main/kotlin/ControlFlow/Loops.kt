package com.megrur.niftiyev.ControlFlow

fun loops() {

    println("=======loop types ======")

    var range = 1..5

    var rangeByStep = range step 2

    var rangeUntil = 1 until 5

    var downRange = 5 downTo 1

    var renges: List<IntProgression> = arrayListOf(range, rangeUntil, rangeByStep, downRange)
    renges.forEach { println(it.toList()) }

    for (i in range) {
        println(i)
    }
    for (i in renges.flatMap { it.toList() }) {
        print(i.toString() + " ")
    }

    var inputPassword: String

    var isPasswordTrue = false
    println("Please enter the password:")
    inputPassword = readln()

    while (!isPasswordTrue) {

        if (inputPassword == "123456") {
            isPasswordTrue = true
            println("Login successful!")
            break
        }

        println("Wrong password!")

        inputPassword = readln()
    }


    do {
        println("Enter the password")
        inputPassword = readln()
    } while (inputPassword == "123456")
    println("Login successful!")

}
