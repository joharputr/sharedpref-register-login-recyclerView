package com.example.sharedpreference.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sharedpreference.R
import com.example.sharedpreference.model.Bola
import kotlinx.android.synthetic.main.item_data.view.*

class BolaAdapter(private  val bolaList: List<Bola>,
                  private  val onClick:(bola:Bola)->Unit,
                  private val onLongClick:(bola:Bola)->Unit
): RecyclerView.Adapter<BolaAdapter.Holder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int):Holder {
        val layoutInflater = LayoutInflater.from(p0.context)
        val view: View = layoutInflater.inflate(R.layout.item_data,p0,false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return bolaList.size
    }


    override fun onBindViewHolder(p0:Holder, pos: Int) {
        val bola = bolaList[pos]
        //bind itu apa
        p0.bind(bola)
        p0.itemView.setOnClickListener {
            onClick(bola)
        }
        p0.itemView.setOnLongClickListener {
            onLongClick(bola)
            return@setOnLongClickListener true
        }

    }
    class Holder(itemView: View) :RecyclerView.ViewHolder(itemView) {

        fun bind(bola: Bola) = itemView.run {
            nama.text = bola.nama
            password.text = bola.password

        }

    }
}