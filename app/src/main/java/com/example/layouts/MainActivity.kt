package com.example.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnRelativeLayout).setOnClickListener {
            startActivity(Intent(this, RelativeLayout::class.java))
        }
        findViewById<Button>(R.id.btnTableLayout).setOnClickListener {
            startActivity(Intent(this, TableLayout::class.java))
        }
        findViewById<Button>(R.id.btnLinearLayout).setOnClickListener {
            startActivity(Intent(this, LinearLayout::class.java))
        }
    }
}