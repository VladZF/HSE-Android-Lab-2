package com.example.hseapp2

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.hseapp2.databinding.CatItemBinding

class CatHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = CatItemBinding.bind(view)

    fun bind(cat: Cat) {
        binding.catName.text = cat.name
        binding.catImage.setImageResource(cat.imageId)
    }
}