package com.kennethmathari.mvc

import android.content.Context
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
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
        binding.userEmail.setOnKeyListener { view, keyCode, _ -> handleKeyEvent(view, keyCode) }
        binding.userPassword.setOnKeyListener { view, keyCode, _ -> handleKeyEvent(view, keyCode) }
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

    private fun handleKeyEvent(view: View, keyCode: Int): Boolean {
        if (keyCode == KeyEvent.KEYCODE_ENTER) {
            // Hide the keyboard
            val inputMethodManager =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
            return true
        }
        return false
    }
}

