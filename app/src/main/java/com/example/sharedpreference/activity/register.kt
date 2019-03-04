package com.example.sharedpreference.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.Preference
import android.widget.Toast
import com.example.sharedpreference.App
import com.example.sharedpreference.R
import com.example.sharedpreference.data.preferenceHelper
import kotlinx.android.synthetic.main.activity_register.*
import java.util.prefs.Preferences

class register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
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


        if(username == "" && email == ""){
          message("jangan kosong bro")
        }
        else{

            App.preference.nama = username
            App.preference.password = password
            App.preference.confirmpass = confirmpass
            App.preference.email = email
            App.preference.university = university
           message("Register Berhasil")
            startActivity(Intent(this,login::class.java))
            finish()
        }
    }

    private fun message(message:String){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }
}
