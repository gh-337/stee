package com.example.stee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ac_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ac2)
    }

    fun oneClikAc1 (viaw : View){
        val intent = Intent(this , MainActivity ::class.java)
        startActivity(intent)
    }

    fun oneClikAc3 (viaw : View){
        val intent = Intent(this , ac_3 ::class.java)
        startActivity(intent)
    }
}