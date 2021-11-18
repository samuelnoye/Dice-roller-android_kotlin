package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

//    private val rollBtn: Button = findViewById(R.id.rollBtn)
//    private val resultText: TextView = findViewById(R.id.diceTv)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn: Button = findViewById(R.id.rollBtn)

        rollBtn.setOnClickListener {
            rollDice()
        }


    }

    private fun rollDice() {
        val imgView: ImageView = findViewById(R.id.ImageView)
        var randomInt = Random.nextInt(6) + 1

        var drawRes = when(randomInt){
            1 -> R.drawable.alea_1
            2 -> R.drawable.alea_2
            3 -> R.drawable.alea_3
            4 -> R.drawable.alea_4
            5 -> R.drawable.alea_5
            else -> R.drawable.alea_6
        }
        imgView.setImageResource(drawRes)
    }
}