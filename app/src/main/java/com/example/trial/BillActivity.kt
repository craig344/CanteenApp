package com.example.trial

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class BillActivity : AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout2)

        for( billItem in BillProvider.BILL_LIST){
                linearLayout.addView(BillItemView(this,billItem))
        }
    }
}