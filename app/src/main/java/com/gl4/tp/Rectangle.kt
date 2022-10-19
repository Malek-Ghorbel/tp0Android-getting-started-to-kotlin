package com.gl4.tp
import kotlin.math.abs

class Rectangle (var  p:Point=Point(0,0) , var  q:Point=Point(1,1) ) {
    override fun toString(): String {
        return "p=$p q=$q"
    }
    fun surface(): Int {
        val hauteur : Int = abs(this.p.x - this.q.x)
        val largeur : Int = abs(this.p.y - this.q.y)
        return hauteur * largeur
    }
}