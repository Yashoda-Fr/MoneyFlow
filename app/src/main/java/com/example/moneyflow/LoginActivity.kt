package com.example.moneyflow

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        // Assuming textView4 is the TextView for signing up
        val signUpTextView = findViewById<TextView>(R.id.textView4)

        signUpTextView.setOnClickListener {
            // Create an Intent to start the SignupActivity
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }

}
