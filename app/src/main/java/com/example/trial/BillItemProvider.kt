package com.example.trial

object BillItemProvider {
    val BILL_ITEM_LIST : MutableList<BillItem> = ArrayList()
    var id_counter : Int = 0

    fun addBillItem(billId: Int, itemName : String, itemImage : Int, itemPrice : Int, itemQuantity : Int){
        BILL_ITEM_LIST.add(BillItem(++id_counter, billId, itemName, itemImage, itemPrice, itemQuantity))
    }
}