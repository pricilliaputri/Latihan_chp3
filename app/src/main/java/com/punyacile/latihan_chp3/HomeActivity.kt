package com.punyacile.latihan_chp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.punyacile.latihan_chp3.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    lateinit var binding : ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}