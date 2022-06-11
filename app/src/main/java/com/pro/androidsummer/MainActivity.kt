package com.pro.androidsummer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView

class MainActivity : AppCompatActivity() {

    private lateinit var diceBtn: AppCompatButton
    private lateinit var diceImg: AppCompatImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceBtn = findViewById(R.id.diceButton)
        diceBtn.setOnClickListener {
            rollDice() }
    }

    private fun rollDice() {
        diceImg = findViewById(R.id.img)
        val randInt = (1..6).random()
        Thread.sleep(1500)
        val drawableResource = when (randInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImg.setImageResource(drawableResource)
    }
}