package com.mmg.kotlin


import java.time.Duration
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val enter:LocalDateTime = LocalDateTime.of(2018,12,25,
        8,0,0)
    val leave:LocalDateTime = LocalDateTime.of(2018,12,25,
        10,8,0)
    var car = Car("ABC-1234",enter)
    car.leave = leave  //setter
    println(car.duration())
    val hours = Math.ceil(car.duration()/60.0).toLong()
    println(hours)
}
class Car(val id:String,val enter:LocalDateTime){
    var leave:LocalDateTime? = null
        set(value){
            if (enter.isBefore(value))
//                this.leave = value 不能用this.leave 不然IDE會以為你要呼叫setter變成無窮迴圈
                field =value //field就是泛指set所代表的東西(此為leave)
        }
    fun duration()=Duration.between(enter,leave).toMinutes()
}

