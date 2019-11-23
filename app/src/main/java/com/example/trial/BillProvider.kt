package com.example.trial

import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

object BillProvider {
    val BILL_LIST : MutableList<Bill> = ArrayList()
    var id_counter : Int = 0
    var df: SimpleDateFormat = SimpleDateFormat("dd/MMM/yyyy hh:mm:ss")

    fun addBill(status: String){
        BILL_LIST.add(Bill(++id_counter, df.format(Calendar.getInstance().getTime()), status))
    }
}