package com.example.intentapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val tv2=findViewById<TextView>(R.id.tv2)

        // get data to intent

        val intent= intent
        val name=intent.getStringExtra("Name")
        val email=intent.getStringExtra("Email")
        val phone=intent.getStringExtra("Phone")

        //set textview
        tv2.text = "Name: $name\nEmail: $email\nPhone: $phone"


    }
}