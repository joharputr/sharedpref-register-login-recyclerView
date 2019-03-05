package com.example.sharedpreference.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import android.widget.Toolbar
import com.example.sharedpreference.App
import com.example.sharedpreference.R
import kotlinx.android.synthetic.main.activity_register.*

class register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
      setSupportActionBar(findViewById(R.id.my_toolbaregister))

        my_toolbaregister.setNavigationOnClickListener {
            startActivity(Intent(this,PageAwal::class.java))
        }

        setupView()

    }

    private fun setupView() {
        register.setOnClickListener {
            register()
        }
    }

    private fun register() {
        var username = fullname.text.toString()
        var password = pass.text.toString()
        var university = university.text.toString()
        var email = email.text.toString()
        var confirmpass = confirmpassword.text.toString()


        if (username == "" || email == "" || university == "" || email == "" || confirmpass == "") {
            message("jangan kosong bro")
        } else if (!confirmpass.equals(password)) {
            message("password harus sama bro")
        } else {

            App.preference.nama = username
            App.preference.password = password
            App.preference.confirmpass = confirmpass
            App.preference.email = email
            App.preference.university = university
            message("Register Berhasil")
            startActivity(Intent(this, login::class.java))
            finish()
        }
    }

    private fun message(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
