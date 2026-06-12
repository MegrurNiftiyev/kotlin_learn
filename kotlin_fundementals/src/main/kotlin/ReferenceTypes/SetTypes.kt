package com.megrur.niftiyev.ReferenceTypes


fun setTypes() {
    println("=======set types ======")
    var set: Set<Any> = setOf('c', 12, 23, "string", 12.4)
    var mutbaleSet: MutableSet<Any> = mutableSetOf('c', 12, 23, "string", 12.4)
    var mutbaleSetSecond: MutableSet<Any> = mutbaleSet
    println(mutbaleSetSecond)
    mutbaleSet.add("new")
    println(mutbaleSetSecond)
    mutbaleSetSecond.add("newk")
    println(mutbaleSet)

    mutbaleSet.removeIf { it is Char || (it is Short) }

}
