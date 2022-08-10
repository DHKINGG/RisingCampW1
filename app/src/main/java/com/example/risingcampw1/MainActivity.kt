package com.example.risingcampw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFrameLayoutRadius()
    }

    private fun setFrameLayoutRadius() {
        iv_food1.clipToOutline = true
        iv_food2.clipToOutline = true
        iv_food3.clipToOutline = true
        iv_food4.clipToOutline = true
        iv_food5.clipToOutline = true
        iv_food6.clipToOutline = true
        iv_food7.clipToOutline = true
        iv_food8.clipToOutline = true
        fr_sale.clipToOutline = true
        fr_more.clipToOutline = true
    }
}