package com.geektech.counter5.model

class CounterModel {
    var count = 0

     fun increment() {
         count++
     }
    fun decrement() {
        count--
    }
    @JvmName("getCount1")
    fun getCount(): Int{
return count
    }
}