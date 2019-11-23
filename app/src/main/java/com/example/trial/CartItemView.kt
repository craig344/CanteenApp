package com.example.trial

import android.content.Context
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView

class CartItemView : FrameLayout{


    val cartItem : Cart

    constructor(context: Context, cartItem :  Cart) : super(context) {
        this.cartItem = cartItem
        initView()
    }

    private fun initView() {
        val view = View.inflate(context, R.layout.view_cart_item, null)
        addView(view)

        val cartItemImage = findViewById<ImageView>(R.id.cartItemImage)
        val cartItemName = findViewById<TextView>(R.id.cartItemName)
        val cartItemPrice = findViewById<TextView>(R.id.cartItemPrice)
        val cartItemTotal = findViewById<TextView>(R.id.cartItemTotal)

        cartItemImage.setImageResource(cartItem.itemImage)
        cartItemName.text = cartItem.itemName
        cartItemPrice.text = cartItem.itemPrice.toString() + " X " + cartItem.itemQuantity.toString()
        var itemTotal = cartItem.itemPrice * cartItem.itemQuantity
        cartItemTotal.text = "₹"+itemTotal.toString()
    }

}