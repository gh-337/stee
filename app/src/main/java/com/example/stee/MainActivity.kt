package com.example.stee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun oneClikAc2 (viaw : View){
        val intent = Intent(this , ac_2 ::class.java)
        startActivity(intent)
    }

    fun oneClikAc3 (viaw : View){
        val intent = Intent(this , ac_3 ::class.java)
        startActivity(intent)
    }
}
