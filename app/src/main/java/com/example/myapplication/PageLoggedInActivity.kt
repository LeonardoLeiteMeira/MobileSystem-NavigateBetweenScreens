package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivityPageLoggedInBinding

class PageLoggedInActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPageLoggedInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPageLoggedInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val email = intent.getStringExtra("email")

        binding.email.setText(email)

        binding.goBack.setOnClickListener{
            //startActivity(Intent(this, MainActivity::class.java)
            finish()
        }
    }
}