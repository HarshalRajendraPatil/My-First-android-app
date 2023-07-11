package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var subInc = findViewById<Button>(R.id.btn2)
        var subDec = findViewById<Button>(R.id.btn1)
        val subCounter = findViewById<TextView>(R.id.incBy)
        var subCount = 0
        var mainCount = 0
        var inc = findViewById<Button>(R.id.button3)
        var dec = findViewById<Button>(R.id.button4)
        var mainCounter = findViewById<TextView>(R.id.textView6)

        subInc.setOnClickListener {
            subCount = subCount + 1
            subCounter.text = subCount.toString()
        }
        subDec.setOnClickListener {
            subCount = subCount - 1
            subCounter.text = subCount.toString()
        }

        inc.setOnClickListener {
            mainCount = mainCount - subCount
            mainCounter.text = mainCount.toString()
        }
        dec.setOnClickListener {
            mainCount = mainCount + subCount
            mainCounter.text = mainCount.toString()
        }

    }
}