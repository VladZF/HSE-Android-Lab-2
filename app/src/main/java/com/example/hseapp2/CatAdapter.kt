package com.example.hseapp2

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CatAdapter : RecyclerView.Adapter<CatHolder>() {
    private var onClickListener: OnClickListener? = null
    private var catList = ArrayList<Cat>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cat_item, parent, false)
        return CatHolder(view)
    }

    override fun getItemCount(): Int {
        return catList.size
    }

    override fun onBindViewHolder(holder: CatHolder, position: Int) {
        val cat = catList[position]
        holder.bind(catList[position])
        holder.itemView.setOnClickListener {
            onClickListener?.onClick(position, cat)
        }

    }

    @SuppressLint("NotifyDataSetChanged")
    fun addCat(cat: Cat) {
        catList.add(cat)
        notifyDataSetChanged()
    }

    fun setOnClickListener(listener: OnClickListener?) {
        this.onClickListener = listener
    }

    interface OnClickListener {
        fun onClick(position: Int, model: Cat)
    }
}