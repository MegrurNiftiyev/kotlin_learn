package com.megrur.niftiyev.ValueTyoes

import com.megrur.niftiyev.Functions.power
import java.math.BigInteger

fun valueType() {

    print("=======value types ======")
    val id: Int = 12
    var score: Int
    val name = "ali"
    score = 50
    score = 20
    var addres: String?
    addres = null
    println(id)
    println("user $name score  is $score and id is $id and adres is ${addres ?: "not kno'wn"}")

    val idToByte: Byte = 110
    var shortType: Short = 3400
    shortType = 3200

    val bankCount: Long = power(value = 2, n = 10)
    val base = BigInteger.valueOf(2L)
    val isMale: Boolean = true
    println(isMale.not())
    println(bankCount)


}