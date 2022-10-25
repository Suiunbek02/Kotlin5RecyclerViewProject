package com.example.kotlin5recyclerviewproject.ui.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.navArgs
import com.example.kotlin5recyclerviewproject.R
import com.example.kotlin5recyclerviewproject.databinding.ActivityMainBinding
import com.example.kotlin5recyclerviewproject.ui.mainrecycler.MainRecyclerFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}