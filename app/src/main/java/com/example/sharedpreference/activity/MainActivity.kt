package com.example.sharedpreference.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.example.sharedpreference.Adapter.BolaAdapter
import com.example.sharedpreference.App
import com.example.sharedpreference.R
import com.example.sharedpreference.common.toast
import com.example.sharedpreference.model.Bola
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val bolaList = listOf(
        Bola("${App.preference.nama}", "${App.preference.password}")
    )
    val bolaAdapter = BolaAdapter(bolaList,{
        Toast.makeText(this,"sss${it.nama}",Toast.LENGTH_SHORT).show()
    },{
      //  onItemLongClick(it)
    })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate( savedInstanceState)
        setContentView(R.layout.activity_main)
          setupView()
         getBola()
      //  Viewpage()

    }

    private fun setupView(){

        tvBola.run {
            layoutManager = LinearLayoutManager(context)
            adapter = bolaAdapter
            setHasFixedSize(true)
        }

    }

    private fun getBola() {
        bolaList
        }
     //   bolaAdapter.notifyDataSetChanged()


  /*  private fun onItemLongClick(it: Bola) {
        toast("LongCLick ${it.nama}")
    }

    private fun onItemClick(it: Bola) {
        toast("click ${it.nama}")
    }*/


/*

    private fun Viewpage() {
        */
/*  username.text = "nama adalah : ${App.preference.nama}"
            password.text = "password adalah :${App.preference.password}"*//*

    }
*/



}
