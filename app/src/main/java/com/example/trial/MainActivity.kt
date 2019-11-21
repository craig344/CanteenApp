package com.example.trial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.canteens)

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.c);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        var canteen1 = findViewById<ImageView>(R.id.imageView)
        canteen1.setOnClickListener{
            val addPage = Intent(this, Canteen1::class.java)
            startActivity(addPage)
            finish()
        }
    }
}
