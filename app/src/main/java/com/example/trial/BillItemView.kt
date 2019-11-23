package com.example.trial

import android.content.Context
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView

class BillItemView : FrameLayout {
    var Activity : BillItemActivity
    val billItem : BillItem

    constructor(context: Context, billItem :  BillItem) : super(context) {
        this.Activity = context as BillItemActivity
        this.billItem = billItem
        initView()
    }
    private fun initView() {
        val view = View.inflate(context, R.layout.view_bill_item, null)
        addView(view)

        val billItemImage = findViewById<ImageView>(R.id.billItemImage)
        val billItemName = findViewById<TextView>(R.id.billItemName)
        val billItemPrice = findViewById<TextView>(R.id.billItemPrice)
        val billItemTotal = findViewById<TextView>(R.id.billItemTotal)

        billItemImage.setImageResource(billItem.itemImage)
        billItemName.text = billItem.itemName
        billItemPrice.text = billItem.itemPrice.toString() + " X " + billItem.itemQuantity.toString()
        var itemTotal = billItem.itemPrice * billItem.itemQuantity
        billItemTotal.text = "₹"+itemTotal.toString()
    }
}