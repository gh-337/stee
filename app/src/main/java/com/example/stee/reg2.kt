package com.example.stee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.stee.databinding.ActivityLoginBinding

class reg2 : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPref = getSharedPreferences("myPref", MODE_PRIVATE)
        val editor = sharedPref.edit()

        binding.apply {
            back2.setOnClickListener {
                val userName = editTextTextEmailAddress2.text.toString() //пердаєм сбда
                val password = editTextTextPassword.text.toString()

                editor.apply {//збереженя
                    putString("user_name",userName)//ключ щою редагуват ы тд
                    putString("password",password)
                    apply()
                }
            }

            pr.setOnClickListener {
                val userName = sharedPref.getString("user_name", null)
                val password = sharedPref.getString("password", null)

                tvUsername.text = userName
                tvPassword.text = password
            }
        }
    }
}