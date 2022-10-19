package com.gl4.tp

fun main(argv : Array<String> ){
    val hello:String = "Hello"
    println(hello)

    val listOfRectangle = listOf(
        Rectangle(),
        Rectangle(q=Point(2,2)),
        Rectangle(p= Point(2,5)),
        Rectangle(p= Point(4,1),q=Point(2,0))
    )

    for(i in listOfRectangle) {
        println(i)
    }

    for(i in listOfRectangle) {
        println(i.surface())
    }
}