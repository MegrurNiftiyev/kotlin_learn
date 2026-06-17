package com.megrur.niftiyev.Classes.Enums

enum class CurrecyType(val value: Double,val symbol: Char ) {
    DOLlAR(1.7,'$'),
    EUR(1.8,'&'),
    AZN(1.0,'A'),
    TL(33.0,'^');

 fun Double.convert(currecyType: CurrecyType): Double
    {
        return this*currecyType.value
    }
    fun Double.printWithSymbol(currecyType: CurrecyType){
        println()
    }

}