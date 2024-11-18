package com.example.miniapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set strings to TextViews
        findViewById<TextView>(R.id.textView1).text = getString(R.string.string1)
        findViewById<TextView>(R.id.textView2).text = getString(R.string.string2)
        findViewById<TextView>(R.id.textView3).text = getString(R.string.string3)
        findViewById<TextView>(R.id.textView4).text = getString(R.string.string4)
        findViewById<TextView>(R.id.textView5).text = getString(R.string.string5)

        // Navigate to SecondActivity
        findViewById<Button>(R.id.buttonNavigate).setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("string1", getString(R.string.string1))
            intent.putExtra("string2", getString(R.string.string2))
            intent.putExtra("string3", getString(R.string.string3))
            intent.putExtra("string4", getString(R.string.string4))
            intent.putExtra("string5", getString(R.string.string5))
            intent.putExtra("isBoolean", true)
            intent.putExtra("intValue", 42)
            intent.putExtra("floatValue", 3.14f)
            startActivity(intent)
        }
    }
}
