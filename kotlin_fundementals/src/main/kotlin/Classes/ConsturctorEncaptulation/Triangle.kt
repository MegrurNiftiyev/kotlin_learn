package com.megrur.niftiyev.Classes.ConsturctorEncaptulation

import kotlin.math.sqrt

class Triangle(point1: Point, point2: Point, point3: Point) {

    var oneTwo = point1.distance(point2)
    var oneThree = point3.distance(point1)
    var twoThree = point3.distance(point2)

    init {
        if (oneTwo > twoThree + oneThree)
            throw error("this treeangle is never exxoit")
        if (twoThree > oneTwo + oneThree)
            throw error("this treeangle is never exxist")
        if (oneThree > oneTwo + twoThree)
            throw error("this treeangle is never exxist")
    }


    fun getArea() : Double {
        val p=(oneTwo+twoThree+oneTwo)/2
        return sqrt(x=p * (p - oneTwo) * (p - twoThree) * (p - oneTwo))
    }
}
