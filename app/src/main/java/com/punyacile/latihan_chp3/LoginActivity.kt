package com.punyacile.latihan_chp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.punyacile.latihan_chp3.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}