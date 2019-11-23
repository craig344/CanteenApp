package com.example.trial

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.get

class CartItemView : FrameLayout{

    var Activity : CartActivity
    val cartItem : Cart
    constructor(context: Context, cartItem :  Cart) : super(context) {
        this.Activity = context as CartActivity
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

        val deleteButton = findViewById<Button>(R.id.deleteButton)
        val addButton = findViewById<Button>(R.id.addButton)

        cartItemImage.setImageResource(cartItem.itemImage)
        cartItemName.text = cartItem.itemName
        cartItemPrice.text = cartItem.itemPrice.toString() + " X " + cartItem.itemQuantity.toString()
        var itemTotal = cartItem.itemPrice * cartItem.itemQuantity
        cartItemTotal.text = "₹"+itemTotal.toString()

        deleteButton.setOnClickListener{
            cartItem.itemQuantity--
            Activity.refreshCart()
        }
        addButton.setOnClickListener{
            cartItem.itemQuantity++
            Activity.refreshCart()
        }
    }
}