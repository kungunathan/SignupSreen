package com.example.signupsreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText

class SignupActivity : AppCompatActivity() {

    lateinit var aplBtn:Button
    lateinit var gglBtn:Button
    lateinit var sgnBtn:Button
    lateinit var name: EditText
    lateinit var email: EditText
    lateinit var password:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        aplBtn = findViewById(R.id.signupapplebtn)
        gglBtn = findViewById(R.id.signupgglbtn)
        sgnBtn = findViewById(R.id.signupbtn)
        name = findViewById(R.id.signupname)
        email = findViewById(R.id.signupemail)
        password = findViewById(R.id.signuppassword)

        aplBtn.setOnClickListener{

        }
        gglBtn.setOnClickListener{

        }
        sgnBtn.setOnClickListener{
            addNewUser()
        }

    }
    private fun addNewUser(){

    }
}