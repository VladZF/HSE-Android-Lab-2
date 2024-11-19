package com.example.hseapp2

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hseapp2.databinding.CatItemBinding

class CatAdapter : RecyclerView.Adapter<CatHolder>() {

    private var catList = ArrayList<Cat>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cat_item, parent, false)
        return CatHolder(view)
    }

    override fun getItemCount(): Int {
        return catList.size
    }

    override fun onBindViewHolder(holder: CatHolder, position: Int) {
        holder.bind(catList[position])
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addCat(cat: Cat) {
        catList.add(cat)
        notifyDataSetChanged()
    }
}