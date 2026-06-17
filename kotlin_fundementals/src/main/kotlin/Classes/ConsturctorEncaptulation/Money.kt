package com.megrur.niftiyev.Classes.ConsturctorEncaptulation

import com.megrur.niftiyev.Classes.Enums.CurrecyType

class Money(amount: Double,currecyType: CurrecyType) {
    val amount:Double=amount
    val currecyType: CurrecyType= currecyType
    constructor(amount: Double,):this(amount, CurrecyType.AZN)



}