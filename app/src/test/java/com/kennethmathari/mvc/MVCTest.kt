package com.kennethmathari.mvc

import com.kennethmathari.mvc.model.User
import junit.framework.Assert.assertEquals
import org.junit.Test

class MVCTest {
    @Test
    fun testUserAcceptsEmailString(){
        val user = User("mathari580@gmail.com","password123")
        assertEquals("mathari580@gmail.com", user.getEmail())
    }

    @Test
    fun testUserAcceptsPasswordString(){
        val user = User("mathari580@gmail.com","password123")
        assertEquals("password123", user.getPassword())
    }

    @Test
    fun testUserAcceptsEmptyEmailString(){
        val user = User("mathari580@gmail.com","password123")
        assertEquals(-1, user.isValid())
    }


}