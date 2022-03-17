package ru.netology

fun main(){
    val numSecond:Int=7200
    println(agoToText(numSecond))
}

fun agoToText(numSecond:Int):String {
    val secondInMinute:Int=60
    val secondInHour:Int=60*60
    val secondInDay:Int=secondInHour*24

    return when{
        (numSecond>secondInDay*3)-> "был(а) давно"
        (numSecond>secondInDay*2)-> "был(а) вчера"
        (numSecond>secondInDay)-> "был(а) сегодня"
        (numSecond>secondInHour)-> "был(а) " +
                "${hoursToText(numSecond/secondInHour)} назад"
        (numSecond>secondInMinute)-> "был(а) " +
                "${minuteToString(numSecond/secondInMinute)} назад"
        else-> "был(а) только что"
    }
}

fun hoursToText(numHours:Int):String{
    if((numHours%100>=10)&&(numHours%100<=20)) return "$numHours часов"

    return when(numHours%10){
        1-> "$numHours час"
        2,3,4-> "$numHours часа"
        else-> "$numHours часов"
    }
}

fun minuteToString(numMinutes: Int):String{
    if((numMinutes%100>=10)&&(numMinutes%100<=20)) return "$numMinutes минут"

    return when(numMinutes%10){
        1-> "$numMinutes минуту"
        2,3,4-> "$numMinutes минуты"
        else-> {
            "$numMinutes минут"
        }
    }
}