package com.example.listviewtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewtask.databinding.ActivityDetailBinding

class detailActivity : AppCompatActivity() {

    var binding : ActivityDetailBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        getExtra()
    }

    private fun getExtra(){
//
        var logo : Int = 0
        var name : String? = null
        var description : String? = null
        logo = intent.getIntExtra(listViewAdapter.LOGO_EXTRA,0)
        name = intent.getStringExtra(listViewAdapter.NAME_EXTRA)
        description = intent.getStringExtra(listViewAdapter.DESCRIPTION_EXTRA)

        binding?.imageViewDetailActivity?.setImageResource(logo)
//        binding?.tvDetailName?.text = name
        binding?.tvDetailDescription?.text = description

        title = name
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}