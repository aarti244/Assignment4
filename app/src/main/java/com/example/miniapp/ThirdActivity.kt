package com.example.miniapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        // Retrieve final data from Intent
        val finalData = intent.getStringExtra("finalData")

        // Display final data in TextView
        findViewById<TextView>(R.id.textView3).text = finalData
    }
}
