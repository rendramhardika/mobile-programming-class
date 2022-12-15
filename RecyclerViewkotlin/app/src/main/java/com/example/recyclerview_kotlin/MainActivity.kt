package com.example.recyclerview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<ItemsViewModel>()

        for (i in 1..20) {
            if (i % 5 == 0) {
                data.add(ItemsViewModel(androidx.appcompat.R.drawable.abc_ic_commit_search_api_mtrl_alpha, null))
            } else {
                data.add(ItemsViewModel(androidx.appcompat.R.drawable.abc_ic_menu_share_mtrl_alpha, "Item $i"))
            }
        }

        val adapter = CustomAdapter(data)

        recyclerView.adapter = adapter
    }
}