package com.kennethmathari.mvc.controller

import com.kennethmathari.mvc.model.User
import com.kennethmathari.mvc.view.ILoginView

class LoginController(var loginView: ILoginView) : ILoginController {


    override fun OnLogin(email: String, password: String) {
        val user= User(email,password)
        val loginCode: Int = user.isValid()


        when(loginCode){
            0->loginView.onLoginError("Please Enter Email!")
            1->loginView.onLoginError("Please Enter a Valid Email!")
            2->loginView.onLoginError("Please Enter Password!")
            3->loginView.onLoginError("Password should be more than 6 characters!")
            -1->loginView.onLoginSuccess("Login Successful")
        }
    }
}