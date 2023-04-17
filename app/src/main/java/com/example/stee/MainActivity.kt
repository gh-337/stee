package com.example.stee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.stee.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val sharedPref = getSharedPreferences("myPref", MODE_PRIVATE)
        val editor =sharedPref.edit()

        binding.apply {
            btnSave.setOnClickListener {
                val userName = edtUsername.text.toString() //-значеня
                val email = edtEmail.text.toString()

                editor.apply {
                    putString("user_name",userName) //dbljlbvj
                    putString("email",email)
                    apply()
                }
            }

            btnLoad.setOnClickListener {

                val userName = sharedPref.getString("user_name",null)
                val email = sharedPref.getString("email",null)

                tvUsername.text = userName
                tvEmail.text=email
            }
        }

    }
}



/*class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun oneClikLogin (viaw : View){
        val intent = Intent(this , Login ::class.java)
        startActivity(intent)
    }

    fun oneClikRegister (viaw : View){
        val intent = Intent(this , Register ::class.java)
        startActivity(intent)
    }
}*/
