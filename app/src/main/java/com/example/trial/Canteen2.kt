package com.example.trial

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Canteen2 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.canteen_2_items)
    }
    override fun onBackPressed() {
        val home = Intent(this, MainActivity::class.java)
        startActivity(home)
        finish()
    }
}