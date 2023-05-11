package com.example.intentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// intialization of view
        val btn=findViewById<Button>(R.id.btn)
        val edname=findViewById<EditText>(R.id.edname)
        val edemail=findViewById<EditText>(R.id.edemail)
        val edcontact=findViewById<EditText>(R.id.edcontact)
         //handle button click
        btn.setOnClickListener {
            // get text from edittexts
            val name=edname.text.toString()
            val email=edemail.text.toString()
            val phone=edcontact.text.toString()

            //intent to start Activity
            val intent= Intent(this@MainActivity,MainActivity2::class.java)
            // give you data to intent
            intent.putExtra("Name",name)
            intent.putExtra("Email",email)
            intent.putExtra("Phone",phone)
            startActivity(intent)

        }
    }
}