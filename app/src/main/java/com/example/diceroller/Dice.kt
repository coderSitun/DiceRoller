package com.example.diceroller

import android.content.res.Resources
import android.graphics.drawable.Drawable
import androidx.core.content.res.ResourcesCompat

class Dice(private val numFaces: Int, private val res : Resources) {
    private var diceNum : Int = 1
    private fun getDrawableId(num : Int) : Int{
        val id = when(num){
            1 -> R.drawable.dice_six_faces_one
            2 -> R.drawable.dice_six_faces_two
            3 -> R.drawable.dice_six_faces_three
            4 -> R.drawable.dice_six_faces_four
            5 -> R.drawable.dice_six_faces_five
            else -> R.drawable.dice_six_faces_six
        }
        return id
    }
    fun roll(): Drawable? {
        diceNum = (1..numFaces).random()
        return ResourcesCompat.getDrawable(res, getDrawableId(diceNum), null)
    }
    override fun toString() : String{
        return diceNum.toString()
    }
}