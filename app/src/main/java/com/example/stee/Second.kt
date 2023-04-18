package com.example.stee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Second : AppCompatActivity() {
    private lateinit var tvName: TextView
    private lateinit var tvEmail: TextView
    private lateinit var mDatabase: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tvName = findViewById(R.id.tv_name)
        tvEmail = findViewById(R.id.tv_email)

        // Ініціалізація Firebase
        mDatabase = FirebaseDatabase.getInstance().reference

        // Отримання даних з Firebase
        mDatabase.child("users").addChildEventListener(object : ChildEventListener {
            override fun onChildAdded(dataSnapshot: DataSnapshot, previousChildName: String?) {
                val user = dataSnapshot.getValue(User::class.java)
                if (user != null) {
                    tvName.text = user.name
                    tvEmail.text = user.email
                }
            }

            // Реалізація інших методів ChildEventListener
        })
    }
}
