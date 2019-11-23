package com.example.trial

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Canteen4 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.canteen_4_items)

        var cartButton = findViewById<ImageButton>(R.id.cartButton)

        cartButton.setOnClickListener{
            val page = Intent(this, CartActivity::class.java)
            startActivity(page)
        }
    }
}