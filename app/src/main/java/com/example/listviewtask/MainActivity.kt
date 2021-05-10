package com.example.listviewtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.listviewtask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding : ActivityMainBinding? = null
    var adapter : listViewAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setUpFacts()
    }

    private fun setUpFacts(){

        adapter = listViewAdapter(this,dummyData.models)
        binding?.listView?.adapter = adapter

    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}