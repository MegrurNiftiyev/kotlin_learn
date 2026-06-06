package com.megrur.niftiyev.ValueTyoes

fun stringType(){

 println("======String Tyoe======")
    val text: String="Lorem ipsum sit doler amet "
    println(text.get(1))
    println(text.compareTo("v"));
    println(text.subSequence(IntRange(2,5)));
    println(text.compareTo(text+" text"));
    println(text.length)

}