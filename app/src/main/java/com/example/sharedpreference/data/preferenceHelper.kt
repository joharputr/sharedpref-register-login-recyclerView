package com.example.sharedpreference.data

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.example.sharedpreference.common.constant

class preferenceHelper (app : Context){


    //  : extends
    private  val sp : SharedPreferences by lazy {
        app.getSharedPreferences("Shared Preference",Context.MODE_PRIVATE)
    }

    private val spE : SharedPreferences.Editor by lazy {
        sp.edit()
    }


    var nama :String
    set(value) {
        spE.putString(constant.NAMA,value).apply()
    }
        get() = sp.getString(constant.NAMA, "")?:""

    var password :String
        set(value) {
            spE.putString(constant.PASSWORD,value).apply()
        }
        get() = sp.getString(constant.PASSWORD, "")?:""

    var email :String
        set(value) {
            spE.putString(constant.EMAIL,value).apply()
        }
        get() = sp.getString(constant.EMAIL, "")?:""

    var confirmpass :String
        set(value) {
            spE.putString(constant.CONFIRMPASS,value).apply()
        }
        get() = sp.getString(constant.CONFIRMPASS, "")?:""

    var university :String
        set(value) {
            spE.putString(constant.UNIVERSITY,value).apply()
        }
        get() = sp.getString(constant.UNIVERSITY, "")?:""
}