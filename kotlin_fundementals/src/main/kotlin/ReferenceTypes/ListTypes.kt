package com.megrur.niftiyev.ReferenceTypes

import com.megrur.niftiyev.Functions.fibonacci

fun listTypes() {
    println("=======list types ======")
    val list: List<Int> = listOf(1, 2, 3, 4)
    val changableList: MutableList<Int> = mutableListOf(1, 1)
    changableList.add(1)
    val listGeneration: List<Int> = List(4) { index -> index }
    val listGeneration2: List<Int> = List(4) { it*8}
    println(list)
    println(changableList)
    println(fibonacci(12))


}
