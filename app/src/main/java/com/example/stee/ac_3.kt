package com.example.stee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ac_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ac3)
    }

    fun oneClikAc1 (viaw : View){
        val intent = Intent(this , MainActivity ::class.java)
        startActivity(intent)
    }

    fun oneClikAc2 (viaw : View){
        val intent = Intent(this , ac_2 ::class.java)
        startActivity(intent)
    }
}