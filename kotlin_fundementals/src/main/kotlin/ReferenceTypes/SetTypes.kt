package com.megrur.niftiyev.ReferenceTypes

import java.util.*


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

    val list: List<Int> = List(20) { it * ((1..10).random()) }
    var unorderedSet = list.toSet()
    var orderedSet = unorderedSet.toSortedSet()

    println(unorderedSet)
    println(orderedSet)

    //unordered uniqe not sorted to fast
    var hashSet: HashSet<Int> = hashSetOf()

    //ordered
    var treeSet: TreeSet<String> = sortedSetOf()

    var linkedSet: LinkedHashSet<Int> = linkedSetOf<Int>()
    var mutableHasSet: MutableSet<Int> = hashSetOf()

}

