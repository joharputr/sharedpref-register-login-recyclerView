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
/*

        App.preference.nama = "aa"
        println("nama : ${App.preference.nama}")
        App.preference.password = "1111"

*/

      /*  var pref = App.preference


        pref.password = "1"*/

    }

    private fun setupView() {
        register.setOnClickListener {
            login()
        }
    }

    private fun login() {
        var username = tvUser.text.toString()
        var password = tvPassword.text.toString()

        if(username == "" && password == ""){
          message("jangan kosong bro")
        }
        else{

            App.preference.nama = username
            App.preference.password = password
           message("Register Berhasil")
            startActivity(Intent(this,login::class.java))
            finish()
        }
    }

    private fun message(message:String){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }
}
