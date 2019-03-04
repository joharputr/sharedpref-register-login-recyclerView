package com.example.sharedpreference.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.example.sharedpreference.Adapter.AndroidVersionAdapter
import com.example.sharedpreference.App
import com.example.sharedpreference.R
import com.example.sharedpreference.model.AndroidVersion
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val bolaList = listOf(
        AndroidVersion("bouget","api level 1","API level 27"),
        AndroidVersion("marshmeleo", "apil evel 2", "API level 28")
       // com.example.sharedpreference.model.AndroidVersion("${App.preference.nama}", "${App.preference.password}")
    )
    val bolaAdapter = AndroidVersionAdapter(bolaList,{
        Toast.makeText(this,"saya memilih ${it.nama}",Toast.LENGTH_SHORT).show()
    })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
          setupView()
         getAndroidVersion()
    }

    private fun setupView(){

        tvBola.run {
            layoutManager = LinearLayoutManager(context)
            adapter = bolaAdapter

        }

    }

    private fun getAndroidVersion() {
        bolaList
        }
     //   bolaAdapter.notifyDataSetChanged()


  /*  private fun onItemLongClick(it: AndroidVersionAdapter) {
        toast("LongCLick ${it.nama}")
    }

    private fun onItemClick(it: AndroidVersionAdapter) {
        toast("click ${it.nama}")
    }*/





}
