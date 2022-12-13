package com.example.diceroller

import android.content.res.Resources
import android.graphics.drawable.Drawable
import androidx.core.content.res.ResourcesCompat

class Dice(private val numFaces: Int, private val res : Resources) {
    private fun getDice(num : Int) : Drawable?{
        when(num)
        {
            1 -> return ResourcesCompat.getDrawable(res, R.drawable.dice_six_faces_one, null)
            2 -> return ResourcesCompat.getDrawable(res, R.drawable.dice_six_faces_two, null)
            3 -> return ResourcesCompat.getDrawable(res, R.drawable.dice_six_faces_three, null)
            4 -> return ResourcesCompat.getDrawable(res, R.drawable.dice_six_faces_four, null)
            5 -> return ResourcesCompat.getDrawable(res, R.drawable.dice_six_faces_five, null)
        }
        return ResourcesCompat.getDrawable(res, R.drawable.dice_six_faces_six, null)
    }
    fun roll(): Drawable? {
        return getDice((1..numFaces).random())
    }
}