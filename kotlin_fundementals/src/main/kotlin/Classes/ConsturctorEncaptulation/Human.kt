package com.megrur.niftiyev.Classes.ConsturctorEncaptulation

class Human(name: String, age: Int) {
    var name: String = name
        set(value) {
            require(value.length > 3) {
                "name must have 3 characters"
            }
            field = value
        }
    var age: Int = age
        set(value) {
            require(value > 0) {
                "Age must be greater than zero"
            }
            field = value
        }

    init {
        require(name.length > 3) {
            "name must have 3 characters"
        }
        require(age > 0) {
            "Age must be greater than zero"
        }
    }


    constructor(name: String) : this(name, 18)

    constructor(age: Int) : this("Adam",age)

    constructor() : this(name = "adam", age = 18)
}
