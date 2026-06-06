package com.megrur.niftiyev.Functions

fun fibonacci(listLength: Int): MutableList<Int> {
    if (listLength <= 0) return mutableListOf()
    if (listLength == 1) return mutableListOf(1)

    val list = mutableListOf(1, 1)

    for (i in 2 until listLength) {
        list.add(list[i - 1] + list[i - 2])
    }

    return list
}
