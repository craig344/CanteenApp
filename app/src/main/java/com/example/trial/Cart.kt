package com.example.trial

class Cart {
    var id : Int
    var itemName : String
    var itemImage : Int
    var itemPrice : Int
    var itemQuantity : Int

    constructor(id : Int, itemName : String, itemImage : Int, itemPrice : Int, itemQuantity : Int){
        this.id = id
        this.itemName = itemName
        this.itemImage = itemImage
        this.itemPrice = itemPrice
        this.itemQuantity = itemQuantity
    }
}