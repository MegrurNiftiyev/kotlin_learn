package com.megrur.niftiyev.ControlFlow

import com.megrur.niftiyev.Classes.Enums.UserStatus

fun conditions() {

    println("=======condition types ======")

    val productPrices = mapOf(
        "Laptop" to 1500,
        "Phone" to 800,
        "Mouse" to 50,
        "Keyboard" to 80
    )

    val userCart = arrayListOf("Laptop", "Mouse", "Mouse")

    var userConditionType: List<UserStatus> = UserStatus.entries

    val userStatus = userConditionType[0]

    val courierStatus = "AVAILABLE"

    var totalPriceForCart = 0
    userCart.forEach {
        totalPriceForCart += productPrices.getOrDefault(it, 0)
    }

    val deliveryFee = if (totalPriceForCart > 1000) 0 else 10

    var totalDiscountedPrice = when (userStatus) {
        UserStatus.PREMIUM -> totalPriceForCart * 0.8
        UserStatus.VIP -> totalPriceForCart * 0.9
        UserStatus.REGULAR -> totalPriceForCart
        else -> totalPriceForCart
    }

    println(totalDiscountedPrice)

    when (courierStatus) {
        "OFFLINE" -> println("The order was cancelled.")
        "BUSY" -> if (userStatus == UserStatus.REGULAR) {
            println("The order was queued because couriers are busy.")
        } else {
            println("The order was confirmed and assigned to a courier.")
        }
        "AVAILABLE" -> println("The order was confirmed and assigned to a courier.")
        else -> println("The order was cancelled.")
    }
}
