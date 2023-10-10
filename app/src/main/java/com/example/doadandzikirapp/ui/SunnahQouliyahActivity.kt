package com.example.doadandzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.doadandzikirapp.R
import com.example.doadandzikirapp.adapter.DzikirDoaAdapter
import com.example.doadandzikirapp.databinding.ActivitySunnahQouliyahBinding
import com.example.doadandzikirapp.model.DataDzikirDoa
import com.example.doadandzikirapp.model.DzikirDoaModel

class SunnahQouliyahActivity : AppCompatActivity() {

    lateinit var binding: ActivitySunnahQouliyahBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySunnahQouliyahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Sunnah - Sunnah Qouliyah"

        binding.apply {
            rvQauliyahShalat.layoutManager = LinearLayoutManager(this@SunnahQouliyahActivity)
            rvQauliyahShalat.adapter = DzikirDoaAdapter(DataDzikirDoa.listQauliyah)
        }

        fun onSupportNavigateUp(): Boolean {
            onBackPressedDispatcher.onBackPressed()
            return super.onSupportNavigateUp()
        }


    }

}