package com.megrur.niftiyev.ReferenceTypes

import com.megrur.niftiyev.Functions.fibonacci

fun listTypes() {
    println("=======list types ======")
    val list: List<Int> = listOf(1, 2, 3, 4, 5, 2, 4, 8, 9)
    val changableList: MutableList<Int> = mutableListOf(1, 1)
    var changabelNumberList: MutableList<Int> = mutableListOf<Int>(1, 2, 3, 4, 5, 2, 4, 8, 9)
    changableList.add(1)
    val listGeneration: List<Int> = List(4) { index -> index }
    val listGeneration2: List<Int> = List(4) { it * 8 }
    val listStrings: MutableList<String>
    println(list)
    println(changableList)
    println(fibonacci(12))

    for (i in 1 until listGeneration2.size)
        println(listGeneration2[i].toString())

    changabelNumberList= changabelNumberList.sorted().toMutableList()
    println(changabelNumberList)

    changabelNumberList = mutableListOf<Int>(7,1, 2, 3, 4, 5, 2, 4, 8, 9)

    changabelNumberList= changabelNumberList.distinct().sorted().toMutableList()
    println(changabelNumberList)
    println(1 in changabelNumberList )

    var bucket : MutableList<Int>? =mutableListOf()

    for ( i in changabelNumberList){
        if(i%2==0){
            bucket?.add(i)
        }
    }

    println(bucket)

    changabelNumberList.removeIf { it%2==0 }


}
