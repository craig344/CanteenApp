package com.example.trial

class BillItem {
    var id : Int
    var billId : Int
    var itemName : String
    var itemImage : Int
    var itemPrice : Int
    var itemQuantity : Int

    constructor(id : Int, billId : Int, itemName : String, itemImage : Int, itemPrice : Int, itemQuantity : Int){
        this.id = id
        this.billId = billId
        this.itemName = itemName
        this.itemImage = itemImage
        this.itemPrice = itemPrice
        this.itemQuantity = itemQuantity
    }
}