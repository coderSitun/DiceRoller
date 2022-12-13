package com.example.diceroller

class Dice(val numFaces : Int){
    fun roll() : Int{
        return (1..numFaces).random()
    }
}