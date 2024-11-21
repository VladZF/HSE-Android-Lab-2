package com.example.hseapp2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.hseapp2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter = CatAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.apply {
            recyclerView.layoutManager = GridLayoutManager(this@MainActivity,2)
            recyclerView.adapter = adapter
            adapter.addCat(Cat(R.drawable.cat1, "Alan"))
            adapter.addCat(Cat(R.drawable.cat2, "Bob"))
            adapter.addCat(Cat(R.drawable.cat3, "Jerry"))
            adapter.addCat(Cat(R.drawable.cat4, "William"))
            adapter.addCat(Cat(R.drawable.cat5, "Artem"))
            adapter.addCat(Cat(R.drawable.cat6, "Cold"))
            adapter.addCat(Cat(R.drawable.cat7, "Kenny"))
            adapter.addCat(Cat(R.drawable.cat8, "Yellow"))
            adapter.addCat(Cat(R.drawable.cat9, "Cool"))
            adapter.addCat(Cat(R.drawable.cat10, "Angel"))
            adapter.addCat(Cat(R.drawable.cat11, "Fox"))
            adapter.addCat(Cat(R.drawable.cat12, "Black"))
            adapter.addCat(Cat(R.drawable.cat13, "Baby"))
            adapter.addCat(Cat(R.drawable.cat14, "Multi"))
            adapter.setOnClickListener(object : CatAdapter.OnClickListener {
                override fun onClick(position: Int, model: Cat) {
                    val intent = Intent(this@MainActivity, CatActivity::class.java)
                    intent.putExtra("cat_name", model.name)
                    intent.putExtra("cat_image", model.imageId)
                    startActivity(intent)
                }
            })
        }
    }
}