package com.kennethmathari.mvc.model

import android.text.TextUtils
import android.util.Patterns
import java.util.regex.Pattern

class User(private var email: String, private var password: String) : IUser {


    override fun getEmail(): String {
        return email
    }

    override fun getPassword(): String {
        return password
    }

    override fun isValid(): Int {
        if(TextUtils.isEmpty(getEmail())){
            return 0
        }else if(!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()){
            return 1
        }else if(TextUtils.isEmpty(getPassword())){
            return 2
        }else if(getPassword().length<=6){
            return 3
        }else
            return -1
    }
}