package com.example.hseapp2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.hseapp2.databinding.ActivityCatBinding

class CatActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCatBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = intent
        binding.currentCatImage.setImageResource(intent.getIntExtra("cat_image", 0))
        binding.currentCatName.text = intent.getStringExtra("cat_name")
        binding.buttonBack.setOnClickListener {
            finish()
        }
    }
}