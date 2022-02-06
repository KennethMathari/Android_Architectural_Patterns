package com.kennethmathari.mvc.model

interface IUser {
    fun getEmail(): String
    fun getPassword(): String
    fun isValid(): Int

}