package com.megrur.niftiyev.Classes.Abstarcts

abstract class Building(val id: Int, val name: String) {

      fun showInfo(){
        println("Id:{$id}, Name:{$name}")
    }
}