package com.example.trial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BillItemActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bill_item)

        val linearLayout = findViewById<LinearLayout>(R.id.billItemLinearLayout)
        val billTotal = findViewById<TextView>(R.id.billTotal)
        val billId = getIntent().getStringExtra("EXTRA_BILL_ID")

        billTotal.text = "0"

        for( billItem in BillItemProvider.BILL_ITEM_LIST){
            if(billItem.billId.toString() == billId){
                linearLayout.addView(BillItemView(this,billItem))
                billTotal.text = (Integer.parseInt(billTotal.text.toString()) + billItem.itemQuantity * billItem.itemPrice).toString()
            }
        }
    }
}