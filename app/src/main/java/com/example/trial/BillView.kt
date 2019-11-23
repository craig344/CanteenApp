package com.example.trial

import android.content.Context
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView

class BillView : FrameLayout {
    var Activity : BillActivity
    val billItem : Bill

    constructor(context: Context, billItem :  Bill) : super(context) {
        this.Activity = context as BillActivity
        this.billItem = billItem
        initView()
    }
    private fun initView() {
        val view = View.inflate(context, R.layout.view_bill, null)
        addView(view)


        val billItemDate = findViewById<TextView>(R.id.billItemDate)
        val billItemStatus = findViewById<TextView>(R.id.billItemStatus)

        billItemDate.text = billItem.date
        billItemStatus.text = billItem.status
    }
}