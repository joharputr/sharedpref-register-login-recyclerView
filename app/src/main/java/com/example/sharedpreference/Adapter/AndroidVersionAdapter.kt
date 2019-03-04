package com.example.sharedpreference.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sharedpreference.R
import com.example.sharedpreference.model.AndroidVersion
import kotlinx.android.synthetic.main.item_data.view.*

class AndroidVersionAdapter(private  val androidVersionList: List<AndroidVersion>,
                            private  val onClick:(androidVersion: AndroidVersion)->Unit

): RecyclerView.Adapter<AndroidVersionAdapter.Holder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int):Holder {
        val layoutInflater = LayoutInflater.from(p0.context)
        val view: View = layoutInflater.inflate(R.layout.item_data,p0,false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return androidVersionList.size
    }


    override fun onBindViewHolder(p0:Holder, pos: Int) {
        val androidVersion = androidVersionList[pos]
        //bind itu apa
        p0.bind(androidVersion)
        p0.itemView.setOnClickListener {
            onClick(androidVersion)
        }


    }
    class Holder(itemView: View) :RecyclerView.ViewHolder(itemView) {

        fun bind(androidVersion: AndroidVersion) = itemView.run {
            version.text = androidVersion.nama
            type.text = androidVersion.password
            api.text = androidVersion.version
        }

    }
}