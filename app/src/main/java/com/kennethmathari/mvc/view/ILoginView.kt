package com.kennethmathari.mvc.view

interface ILoginView {
    fun onLoginSuccess(message: String)
    fun onLoginError(message: String)
}