package com.example.sharedpreference.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.sharedpreference.Adapter.AndroidVersionAdapter
import com.example.sharedpreference.App
import com.example.sharedpreference.R
import com.example.sharedpreference.model.AndroidVersion
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val bolaList = listOf(
        AndroidVersion("Android 1.0", "version 1.0", "API level 1"),
        AndroidVersion("Android 1.1", "version 1.1", "API level 2"),
        AndroidVersion("Cupcake", "version 1.5","API level 3"),
        AndroidVersion("Donut", "version 2,6" ,"APi level 4"),
        AndroidVersion("Eclair","2.0", "API 5"),
        AndroidVersion("Froyo", "2.2" ,"API 8"),
        AndroidVersion("Gingerbread" ,"2.3" , "API 9"),
        AndroidVersion("HoneyComb", "3.0", "API 11"),
        AndroidVersion("Ice Cream Sandwich", "4.0","API 14"),
        AndroidVersion("Jelly Bean" ,"4.3" ,"API 16"),
        AndroidVersion("Kitkat" ,"4.4" , "API 19"),
        AndroidVersion("Lollipop" ,"5.0" , "API level 22"),
        AndroidVersion("MArshmellow", "6.0" ,"API level 23"),
        AndroidVersion("Nougat" ,"7.0", "API level 24"),
        AndroidVersion("Oreo" , " 8.0" , "API level 26"),
        AndroidVersion("Pie" , "9.0" ,"API level 29")

        // com.example.sharedpreference.model.AndroidVersion("${App.preference.nama}", "${App.preference.password}")
    )
    val bolaAdapter = AndroidVersionAdapter(bolaList, {
        Toast.makeText(this, "saya memilih ${it.nama}", Toast.LENGTH_SHORT).show()
    })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        getAndroidVersion()
        setSupportActionBar(findViewById(R.id.my_toolbar))

    }


    private fun setupView() {

        tvBola.run {
            layoutManager = LinearLayoutManager(context)
            adapter = bolaAdapter

        }

    }

    private fun getAndroidVersion() {
        bolaList
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main_bottom_nav, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.logout -> {
            App.preference.logOut()
            finish()
            startActivity(Intent(this, PageAwal::class.java))
            // User chose the "Print" item
            Toast.makeText(this, "logout sukses , data terhapus", Toast.LENGTH_LONG).show()
            true
        }

        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }

    //   bolaAdapter.notifyDataSetChanged()


    /*  private fun onItemLongClick(it: AndroidVersionAdapter) {
          toast("LongCLick ${it.nama}")
      }

      private fun onItemClick(it: AndroidVersionAdapter) {
          toast("click ${it.nama}")
      }*/


}
