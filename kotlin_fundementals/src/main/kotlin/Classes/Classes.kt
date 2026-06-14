package com.megrur.niftiyev.Classes

import com.megrur.niftiyev.Exceptions.exceptions
import javax.annotation.processing.Messager
import kotlin.math.pow
import kotlin.math.sqrt

fun classes() {
    println("=============  classes  ==============")

    var person: Person = Person(name = "Human")

    var point: Point = Point(12.0, 23.0)
    var pintSecond: Point = Point(12.0, 23.0)
    print(point.toString())
    println(point == pintSecond)
    println(point.x)
}


class Person(var name: String)

class Human(name: String,age:Int){
    public var name: String =name
        set(value){
            require(value.length>3){
                "name must have 3 characters"
            }
        }
    public  var age: Int =age
        set(value) {
            require(value > 0){
                "Age must be greater than zero"
            }
            field = value
        }
    init {
        require(name.length>3){
            "name must have 3 characters"
        }
        require(age > 0){
            "Age must be greater than zero"
        }
    }
}


class Trieangle(point1: Point,point2: Point,point3: Point){
    init {
        var oneTwo=point1.distance(point2)
        var oneThree=point3.distance(point1)
        var twoThree=point3.distance(point2)
        if(oneTwo>twoThree+oneThree)
            throw error("this treeangle is never exxoit")
        if (twoThree>oneTwo+oneThree)
            throw error("this treeangle is never exxist")
        if(oneThree>oneTwo+twoThree)
            throw error("this treeangle is never exxist")
    }
}


class Point(x: Double, y: Double) {
    public var x: Double = x
        set(_) {
            throw NotChangableFiled("you can't change this filed")
        }
        get() = field

    protected var y: Double = y


    fun changeCordınte(x: Double?, y: Double?) {
        if (x != null) this.x = x
        if (y != null) this.y = y
    }

    operator fun plus(other: Point): Point {


        return Point(this.x + other.x, this.y + other.y)
    }

    override fun toString(): String {
        return "x:$x,y:$y"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            return other.x == this.x && other.y == this.y
        }
        return false
    }

  public  fun distance(other : Point): Double {
        return sqrt ((other.x-this.x).pow(2.0)+(other.y-this.y).pow(2.0))
    }
}

class NotChangableFiled(message: String): Exception(message)