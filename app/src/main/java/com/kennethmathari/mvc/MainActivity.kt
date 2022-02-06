package com.kennethmathari.mvc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kennethmathari.mvc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.userButton.setOnClickListener { login() }
    }

    private fun login() {
        TODO("Not yet implemented")
    }
}

