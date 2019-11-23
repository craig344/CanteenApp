package com.example.trial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Canteen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.canteen_3_items)

        var cartButton = findViewById<ImageButton>(R.id.cartButton)
        var addItem9 = findViewById<Button>(R.id.canteen3_item1_addButton)
        var addItem10 = findViewById<Button>(R.id.canteen3_item2_addButton)
        var addItem11 = findViewById<Button>(R.id.canteen3_item3_addButton)
        var addItem12 = findViewById<Button>(R.id.canteen3_item4_addButton)

        var removeItem9 = findViewById<Button>(R.id.canteen3_item1_deleteButton)
        var removeItem10 = findViewById<Button>(R.id.canteen3_item2_deleteButton)
        var removeItem11 = findViewById<Button>(R.id.canteen3_item3_deleteButton)
        var removeItem12 = findViewById<Button>(R.id.canteen3_item4_deleteButton)

        var toastAdded = Toast.makeText(getApplicationContext(),"1 item added to cart", Toast.LENGTH_SHORT)
        var toastRemoved = Toast.makeText(getApplicationContext(),"1 item removed to cart", Toast.LENGTH_SHORT)

        cartButton.setOnClickListener{
            val page = Intent(this, CartActivity::class.java)
            startActivity(page)
        }
        addItem9.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 9){
                    it.itemQuantity++
                    toastAdded.show()
                }
            }
        }
        addItem10.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 10){
                    it.itemQuantity++
                    toastAdded.show()
                }
            }
        }
        addItem11.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 11){
                    it.itemQuantity++
                    toastAdded.show()
                }
            }
        }
        addItem12.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 12){
                    it.itemQuantity++
                    toastAdded.show()
                }
            }
        }

        removeItem9.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 9 && it.itemQuantity > 0){
                    it.itemQuantity--
                    toastRemoved.show()
                }
            }
        }
        removeItem10.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 10 && it.itemQuantity > 0){
                    it.itemQuantity--
                    toastRemoved.show()
                }
            }
        }
        removeItem11.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 11 && it.itemQuantity > 0){
                    it.itemQuantity--
                    toastRemoved.show()
                }
            }
        }
        removeItem12.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 12 && it.itemQuantity > 0){
                    it.itemQuantity--
                    toastRemoved.show()
                }
            }
        }
    }
}