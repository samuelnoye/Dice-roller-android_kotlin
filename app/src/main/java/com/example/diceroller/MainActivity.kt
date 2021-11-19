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

    private lateinit var imgDice: ImageView
    private lateinit var rollBtn: Button
    private lateinit var reset: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         imgDice = findViewById(R.id.ImageView)
         rollBtn = findViewById(R.id.rollBtn)
        reset = findViewById(R.id.resendTv)

       imgDice.setImageResource(R.drawable.alea_0)


        rollBtn.setOnClickListener {
            rollDice()
        }

        reset.setOnClickListener {
            imgDice.setImageResource(R.drawable.alea_0)
        }


    }

    private fun rollDice() {

        var randomInt = Random.nextInt(6) + 1

        Toast.makeText(this,"$randomInt",Toast.LENGTH_SHORT).show()

        var drawRes = when(randomInt){
            1 -> R.drawable.alea_1
            2 -> R.drawable.alea_2
            3 -> R.drawable.alea_3
            4 -> R.drawable.alea_4
            5 -> R.drawable.alea_5
            else -> R.drawable.alea_6
        }
        imgDice.setImageResource(drawRes)

    }
}