package com.example.sharedpreference.activity

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreference.App
import com.example.sharedpreference.R
import kotlinx.android.synthetic.main.activity_page_awal.*

class PageAwal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_awal)
        setOnClick()
        cekUser()
    }

    private fun cekUser() {
        if (App.preference.nama.isNotBlank()){
            startActivity(Intent(this,MainActivity::class.java))
        }
    }

    private fun setOnClick() {
        loginButtom.setOnClickListener {
            startActivity(Intent(this,login::class.java))
        }

        registerButton.setOnClickListener {
            startActivity(Intent(this,register::class.java))
        }
    }
}
