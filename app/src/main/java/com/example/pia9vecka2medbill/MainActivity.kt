package com.example.pia9vecka2medbill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counterNumber : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counterTextView: TextView = findViewById<TextView>(R.id.countertextView)

        counterTextView.text = "0"

        var plusButton = findViewById<Button>(R.id.plusButton)
        plusButton.setOnClickListener {
            counterNumber += 1
            counterTextView.text = counterNumber.toString()
        }

        var minusButton = findViewById<Button>(R.id.minusButton)
        minusButton.setOnClickListener {
            counterNumber -= 1

            if (counterNumber < 0)
            {
                counterNumber = 0
            }
            counterTextView.text = counterNumber.toString() }

        var resetButton = findViewById<Button>(R.id.resetButton)
        resetButton.setOnClickListener {
            counterNumber = 0
            counterTextView.text = counterNumber.toString()

        }




    }
}