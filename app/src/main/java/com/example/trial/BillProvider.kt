package com.example.trial

import java.util.*
import kotlin.collections.ArrayList

object BillProvider {
    val BILL_LIST : MutableList<Bill> = ArrayList()
    var id_counter : Int = 0

    fun addBill(status: String){
        BILL_LIST.add(Bill(++id_counter, Calendar.getInstance().getTime().toString(), status))
    }
}