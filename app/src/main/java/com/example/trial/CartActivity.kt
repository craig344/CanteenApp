package com.example.trial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class CartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)

        CartProvider.initCart()

        for( cartItem in CartProvider.CART_LIST){
            if(cartItem.itemQuantity>0){
                linearLayout.addView(CartItemView(this,cartItem))
            }
        }

    }
}
