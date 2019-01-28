package com.mmg

import com.mmg.kotlin.Car
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val parkingLot = HashMap<String,Car?>()
    var enter = LocalDateTime.of(2018,12,25,8,0,0)
    var car:Car? = Car("AADP-0012",enter)
    parkingLot.put(car!!.id,car)
    car = Car("QWER-1458",enter.plusMinutes(15))
    parkingLot.put(car.id,car)
    //Car1 leaving
    var leave = LocalDateTime.of(2018,12,25,9,0,0)
    car = parkingLot.get("AADP-0012")
    car?.leave = leave
    println("${car?.id} duration ${car?.duration()}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)
    //Car2 leaving
    car = parkingLot.get("QWER-1458")
    car?.leave = leave.plusHours(2)
    println("${car?.id} duration ${car?.duration()}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)


//    part1()
}

private fun part1() {
    //可改變資料的集合，在記憶體處理的時候資源會耗費的很多
    val list = listOf(5, 1, 3, 7, 8)        //listOf 為不可變(不可增加減少)
    println(list)
    val scores = listOf(68, 55, 77, 88, 99)
    for (score in scores) {
        println(score)
    }
    var mutableList = mutableListOf(5, 1, 2, 7) //mutableList為可變
    mutableList.add(888) //可ADD
    println(mutableList)
}