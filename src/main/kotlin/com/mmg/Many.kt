package com.mmg

fun main(args: Array<String>) {
    //可改變資料的集合，在記憶體處理的時候資源會耗費的很多
    val list  = listOf(5,1,3,7,8)        //listOf 為不可變(不可增加減少)
    println(list)
    val scores = listOf(68,55,77,88,99)
    for (score in scores){
        println(score)
    }
    var mutableList = mutableListOf(5,1,2,7) //mutableList為可變
    mutableList.add(888) //可ADD
    println(mutableList)
}