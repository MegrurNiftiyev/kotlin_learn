package com.megrur.niftiyev.Classes.Singelton

import com.megrur.niftiyev.Classes.Abstarcts.User
import com.megrur.niftiyev.Exceptions.UserDublicatedException

class Database private constructor() {
companion object {
    // val instance: Database=Database()
    val instance: Database by lazy { Database() }
}       
    private var userData: MutableSet<User> = hashSetOf()

    fun addUser(user: User) {
        if(userData.contains(user)){
           throw UserDublicatedException("User already exists")
        }
        userData.add(user)
    }
    fun getUsers(): Set<User>{
        return userData
    }
}


