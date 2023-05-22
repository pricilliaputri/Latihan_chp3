package com.punyacile.latihan_chp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.punyacile.latihan_chp3.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}