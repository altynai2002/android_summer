package com.pro.androidsummer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {

    private lateinit var diceBtn: AppCompatButton
    private lateinit var diceText: AppCompatTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceBtn = findViewById(R.id.diceButton)
        diceBtn.setOnClickListener {
            Toast.makeText(this, "dice starts rolling", Toast.LENGTH_SHORT).show()
            rollDice() }
    }

    private fun rollDice() {
        diceText = findViewById(R.id.diceTxt)
        val randInt = (1..6).random()
        Thread.sleep(2000)
        diceText.text = randInt.toString()
    }
}