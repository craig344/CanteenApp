package com.example.trial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class CartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val buyBtn = findViewById<Button>(R.id.buy_button)
        val viewBills = findViewById<Button>(R.id.button_vieworders)
        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)
        val cartTotal = findViewById<TextView>(R.id.cartTotal)
        cartTotal.text = "0"

        buyBtn.setOnClickListener{
            for( cartItem in CartProvider.CART_LIST){
                if(cartItem.itemQuantity>0){
                    createBill()
                    break
                }
            }
        }

        viewBills.setOnClickListener{
            val page = Intent(this, BillActivity::class.java)
            startActivity(page)
        }

        for( cartItem in CartProvider.CART_LIST){
            if(cartItem.itemQuantity>0){
                linearLayout.addView(CartItemView(this,cartItem))
                cartTotal.text = (Integer.parseInt(cartTotal.text.toString()) + cartItem.itemQuantity * cartItem.itemPrice).toString()
            }
        }
    }

    fun refreshCart(){
        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)
        val cartTotal = findViewById<TextView>(R.id.cartTotal)
        cartTotal.text = "0"
        linearLayout.removeAllViews()
        for( cartItem in CartProvider.CART_LIST){
            if(cartItem.itemQuantity>0){
                linearLayout.addView(CartItemView(this,cartItem))
                cartTotal.text = (Integer.parseInt(cartTotal.text.toString()) + cartItem.itemQuantity * cartItem.itemPrice).toString()
            }
        }
    }

    fun createBill(){
        BillProvider.addBill("Order Accepted")
        for(cartItem in CartProvider.CART_LIST){
            if(cartItem.itemQuantity>0){
                BillItemProvider.addBillItem(BillProvider.id_counter,cartItem.itemName, cartItem.itemImage, cartItem.itemPrice, cartItem.itemQuantity)
                cartItem.itemQuantity = 0
            }
        }
        refreshCart()
        processBill()
    }

    fun processBill(){
        for(billItem in BillProvider.BILL_LIST){
            if(billItem.id == BillProvider.id_counter){
                Handler().postDelayed({
                    Toast.makeText(getApplicationContext(), billItem.status, Toast.LENGTH_SHORT).show()
                }, 3000)
                Handler().postDelayed({
                    billItem.status = "Order is being prepared"
                    Toast.makeText(getApplicationContext(), billItem.status, Toast.LENGTH_SHORT).show()
                }, 6000)
                Handler().postDelayed({
                    billItem.status = "Order is Ready"
                    Toast.makeText(getApplicationContext(), billItem.status, Toast.LENGTH_SHORT).show()
                }, 9000)
                Handler().postDelayed({
                    billItem.status = "Order Completed"
                    Toast.makeText(getApplicationContext(), billItem.status, Toast.LENGTH_SHORT).show()
                }, 12000)
            }
        }
    }
}
