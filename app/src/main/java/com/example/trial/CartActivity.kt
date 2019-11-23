package com.example.trial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class CartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)

        for( cartItem in CartProvider.CART_LIST){
            if(cartItem.itemQuantity>0){
                linearLayout.addView(CartItemView(this,cartItem))
            }
        }
    }
    fun refreshCart(){
        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)
        linearLayout.removeAllViews()
        for( cartItem in CartProvider.CART_LIST){
            if(cartItem.itemQuantity>0){
                linearLayout.addView(CartItemView(this,cartItem))
            }
        }
    }
}
