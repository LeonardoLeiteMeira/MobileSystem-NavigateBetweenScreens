package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener{
            var email = binding.inputEmail.text.toString()
            var password = binding.inputPassword.text.toString()

            if(email.isBlank()||email.isEmpty() ||password.isEmpty()||password.isBlank()){
                Toast.makeText(applicationContext,"Enter your credentials",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(applicationContext,"Welcome to the app",Toast.LENGTH_LONG).show()
                binding.inputEmail.setText("")
                binding.inputPassword.setText("")
                var intent = Intent(this, PageLoggedInActivity::class.java)
                intent.putExtra("email", email)
                startActivity(intent)
            }
        }

        binding.facebook.setOnClickListener {
            Toast.makeText(applicationContext,"Not implemented",Toast.LENGTH_LONG).show()
        }
        binding.google.setOnClickListener {
            Toast.makeText(applicationContext,"Not implemented",Toast.LENGTH_LONG).show()
        }
        binding.github.setOnClickListener {
            Toast.makeText(applicationContext,"Not implemented",Toast.LENGTH_LONG).show()
        }
    }
}