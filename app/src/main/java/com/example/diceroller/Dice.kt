package com.example.diceroller

import android.content.res.Resources
import android.graphics.drawable.Drawable
import androidx.core.content.res.ResourcesCompat

class Dice(private val numFaces: Int, private val res : Resources) {
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
        return ResourcesCompat.getDrawable(res, getDrawableId((1..numFaces).random()), null)
    }
}