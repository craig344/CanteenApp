package com.example.trial

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Canteen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.canteen_3_items)

        var cartButton = findViewById<ImageButton>(R.id.cartButton)

        cartButton.setOnClickListener{
            val page = Intent(this, CartActivity::class.java)
            startActivity(page)
        }
    }
}