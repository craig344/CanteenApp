package com.example.trial

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class BillActivity : AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bill)

        val linearLayout = findViewById<LinearLayout>(R.id.billLinearLayout)

        for( billItem in BillProvider.BILL_LIST){
                linearLayout.addView(BillView(this,billItem))
        }
    }
}