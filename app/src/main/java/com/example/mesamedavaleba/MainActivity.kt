package com.example.mesamedavaleba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var  viewPager2 : ViewPager2
    private lateinit var  tablayout : TabLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager2 = findViewById(R.id.viewpager)
        tablayout = findViewById(R.id.tablayout)

        viewPager2.adapter = ViewPagerFragmentAdapter(this)

        TabLayoutMediator(tablayout, viewPager2) {tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()
    }
}