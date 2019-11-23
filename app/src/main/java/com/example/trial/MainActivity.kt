package com.example.trial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.canteens)

        var canteen1 = findViewById<ImageView>(R.id.imageView)
        var canteen2 = findViewById<ImageView>(R.id.imageView2)
        var canteen3 = findViewById<ImageView>(R.id.imageView3)
        var canteen4 = findViewById<ImageView>(R.id.imageView4)
        canteen1.setOnClickListener{
            val addPage = Intent(this, Canteen1::class.java)
            startActivity(addPage)
        }
        canteen2.setOnClickListener{
            val addPage = Intent(this, Canteen2::class.java)
            startActivity(addPage)
        }
        canteen3.setOnClickListener{
            val addPage = Intent(this, Canteen3::class.java)
            startActivity(addPage)
        }
        canteen4.setOnClickListener{
            val addPage = Intent(this, Canteen4::class.java)
            startActivity(addPage)
        }
        CartProvider.initCart()
    }
}
