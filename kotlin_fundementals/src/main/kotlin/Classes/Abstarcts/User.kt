package com.megrur.niftiyev.Classes.Abstarcts

import com.megrur.niftiyev.Classes.Interfaces.Identifiable

class User(id: Int, name: String) : Identifiable , Comparable<User> {
    override var id: Int = id
    val name: String = name

    fun showUserInfo() {
        println("Id $id: name: $name")
    }

    override fun equals(other: Any?): Boolean {
        if (other is User) {
            return id == other.id
        }
        return false
    }
    override  fun compareTo(other: User): Int {
        return id.compareTo(other.id)
    }
}