package com.megrur.niftiyev.Classes.ConsturctorEncaptulation

import com.megrur.niftiyev.Exceptions.*
import kotlin.math.pow
import kotlin.math.sqrt

class Point(x: Double, y: Double) {
    var x: Double = x
        set(_) {
            throw NotChangableFiled("you can't change this filed")
        }

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

    fun distance(other: Point): Double {
        return sqrt((other.x - this.x).pow(2.0) + (other.y - this.y).pow(2.0))
    }
}

