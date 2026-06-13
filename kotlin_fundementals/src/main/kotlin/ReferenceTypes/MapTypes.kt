package com.megrur.niftiyev.ReferenceTypes


fun mapTypes() {
    println("=======map types ======")
    val map: Map<String, Int> = mapOf("key1" to 1, "key2" to 2)
    println(map)
    val mapMutible: MutableMap<String, Int> = mutableMapOf("key1" to 1, "key2" to 2)
    map.forEach { string, i ->
        println(string + " " + i)
    }

    for (key in mapMutible.keys)
        if (key == "key2") println(1) else println(0)

    val students: Map<String, String> = mapOf<String, String>(
        "John" to "Computer Science",
        "Emily" to "Mathematics",
        "Michael" to "Computer Science",
        "Jessica" to "Cybersecurity",
        "David" to "Mathematics",
        "James" to "Computer Science"
    )

println(findMostIttaratedValues(students))
}

fun findMostIttaratedValues(map: Map<String, String>): String {
    var elementCounts = mutableMapOf<String, Int>()
    map.forEach { _, value ->
        if(!elementCounts.keys.contains(value)){
            elementCounts[value]=0
        }
     elementCounts[ value ]  = ((elementCounts[value]!! + 1))
    }

    var maxItaratedKey: String = elementCounts .keys.toList()[0]
    elementCounts.forEach { key, value ->

     if(value >= elementCounts[maxItaratedKey]!! )
         maxItaratedKey= key
    }
    return maxItaratedKey
}

