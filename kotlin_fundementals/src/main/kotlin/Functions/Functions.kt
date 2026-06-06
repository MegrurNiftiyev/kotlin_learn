package com.megrur.niftiyev.Functions


fun power(value: Int, n: Int): Long {
    var reasult: Long = 1;
    for (i in 1..n) {
        reasult *= value
    }
    return reasult
}

fun power(value: Double, n: Int): Double {
    var reasult: Double = 1.0;
    for (i in 1..n) {
        reasult *= value
    }
    return reasult
}