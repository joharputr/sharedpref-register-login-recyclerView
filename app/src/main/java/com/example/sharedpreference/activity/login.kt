package com.example.sharedpreference.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.sharedpreference.App
import com.example.sharedpreference.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.login.*

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        setupView()
    }

    private fun setupView() {
        login.setOnClickListener {
            goLogin()
        }
    }


    private fun goLogin() {
        var email = tvUserLogin.text.toString()
        var password = tvPasswordLogin.text.toString()
        if (email == App.preference.email && password == App.preference.password){

            Toast.makeText(this,"login berhasil",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,MainActivity::class.java))
        }
        else {
            Toast.makeText(this, "login gagal", Toast.LENGTH_SHORT).show()
        }
    }
}