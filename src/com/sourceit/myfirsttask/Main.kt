package com.sourceit.myfirsttask

fun main(args: Array<String>) {
    var a = 5
    var b = 4
    var c = 6

        if (a > b && c > b)
        println(a * a + c * c)
        else if (c > a)
        println(b * b + c * c)
        else
        println(b * b + a * a)
}