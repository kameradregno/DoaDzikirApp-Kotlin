package com.example.doadandzikirapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.doadandzikirapp.R
import com.example.doadandzikirapp.adapter.ArtikelAdapter
import com.example.doadandzikirapp.databinding.ActivityDzikirPagiDanPetangBinding
import com.example.doadandzikirapp.ui.detail.DzikirPagiActivity

class DzikirPagiDanPetangActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDzikirPagiDanPetangBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirPagiDanPetangBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }


}