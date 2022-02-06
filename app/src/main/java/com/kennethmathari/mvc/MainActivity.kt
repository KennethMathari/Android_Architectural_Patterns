package com.kennethmathari.mvc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kennethmathari.mvc.controller.ILoginController
import com.kennethmathari.mvc.controller.LoginController
import com.kennethmathari.mvc.databinding.ActivityMainBinding
import com.kennethmathari.mvc.view.ILoginView

class MainActivity : AppCompatActivity(), ILoginView {
    private lateinit var binding: ActivityMainBinding

    lateinit var loginController:ILoginController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loginController=LoginController(this)

        binding.userButton.setOnClickListener { login() }
    }

    private fun login() {
        loginController.OnLogin(binding.userEmail.text.toString().trim(), binding.userPassword.text.toString().trim())
    }

    override fun onLoginSuccess(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }

    override fun onLoginError(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }
}

