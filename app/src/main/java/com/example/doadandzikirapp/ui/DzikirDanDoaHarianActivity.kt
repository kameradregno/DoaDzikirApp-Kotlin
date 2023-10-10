package com.example.doadandzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.doadandzikirapp.R
import com.example.doadandzikirapp.adapter.DzikirDoaAdapter
import com.example.doadandzikirapp.databinding.ActivityDzikirDanDoaHarianBinding
import com.example.doadandzikirapp.model.DataDzikirDoa
import com.example.doadandzikirapp.model.DzikirDoaModel
import com.example.doadandzikirapp.ui.detail.DetailArtikelActivity

class DzikirDanDoaHarianActivity : AppCompatActivity() {


    lateinit var binding: ActivityDzikirDanDoaHarianBinding
    private val doaharian: ArrayList<DzikirDoaModel> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirDanDoaHarianBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            rvDzikirDoaHarian.layoutManager = LinearLayoutManager(this@DzikirDanDoaHarianActivity)
            rvDzikirDoaHarian.adapter = DzikirDoaAdapter(doaharian)
        }


        setDataDzikirDoaHarian()

    }

    private fun setDataDzikirDoaHarian(): ArrayList<DzikirDoaModel> {
        val dzikir = resources.getStringArray(R.array.arr_dzikir_doa_harian)
        val lafaz = resources.getStringArray(R.array.arr_lafaz_dzikir_doa_harian)
        val terjemah = resources.getStringArray(R.array.arr_terjemah_dzikir_doa_harian)

        for (i in dzikir.indices){
            val dzikir = DzikirDoaModel(
                dzikir[i],
                lafaz[i],
                terjemah[i]
            )
            doaharian.addAll(listOf(dzikir))
        }
        return doaharian
    }
}