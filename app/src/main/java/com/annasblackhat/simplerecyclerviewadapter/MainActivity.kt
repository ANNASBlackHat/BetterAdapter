package com.annasblackhat.simplerecyclerviewadapter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.annasblackhat.betteradapter.BetterAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = listOf(
                Product("Tisu Wajah", 8700, "google.com"),
                Product("Indomilk Full Cream", 500, "google.com"),
                Product("Sari Roti Sand  K/Keju", 4500, "google.com")
        )

        recview.adapter = object : BetterAdapter(R.layout.list_item_product, list, BR.model){}
    }
}
