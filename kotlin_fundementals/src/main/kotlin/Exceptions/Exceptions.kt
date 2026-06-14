package com.megrur.niftiyev.Exceptions

import com.sun.jdi.request.InvalidRequestStateException

fun exceptions() {
    println("=============  exceptions =============")

    try {
        getNumeberUser()
        getStringUser()
        chechSystemStatus(false,"")

    }
    catch (e: NotALetterException){
        println(e.javaClass.simpleName)
        println(e.message)
    }
    catch (e: Exception){
        println(e.javaClass.simpleName)
        println(e.message)
    }


}


fun getNumeberUser() {
    print("input only number")
    var input = readln()
    input.forEach {
       require( it.isDigit()){"it isn't a digit"}
    }

}



fun getStringUser() {
    print("input only String")
    var input = readln()
    input.forEach {
     if(  it.isDigit()){
         throw  NotALetterException("it isn't a string")
     }
    }

}


fun chechSystemStatus(isSystemFine: Boolean,message: String){
    if(!isSystemFine) error("system is not avable")
    check(message.isNotBlank()){"message isn't blank"}
}





open class NotALetterException( message: String) : Exception(message)