package com.pro.androidsummer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import com.pro.androidsummer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            diceButton.setOnClickListener {
                rollDice()
            }
        }

    }

    private fun rollDice() {
        val randInt = (1..6).random()
        Thread.sleep(2000)
        binding.diceTxt.text = randInt.toString()
    }
}