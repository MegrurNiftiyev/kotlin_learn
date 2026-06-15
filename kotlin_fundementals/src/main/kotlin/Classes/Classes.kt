package com.megrur.niftiyev.Classes

import com.megrur.niftiyev.Classes.ConsturctorEncaptulation.Human
import com.megrur.niftiyev.Classes.ConsturctorEncaptulation.Point

fun classes() {
    println("=============  classes  ==============")

    var person: Person = Person(name = "Human")

    var point: Point = Point(12.0, 23.0)
    var pintSecond: Point = Point(12.0, 23.0)
    print(point.toString())
    println(point == pintSecond)
    println(point.x)
    try {
        var human: Human = Human(-2)
    }catch (e:Exception){
        println(e.message)
    }

    var human2: Human = Human(12)
    var human3: Human = Human("David")

    println(human2.name)
}


class Person(var name: String)







