package com.example.trial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Canteen2 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.canteen_2_items)

        var cartButton = findViewById<ImageButton>(R.id.cartButton)
        var addItem5 = findViewById<Button>(R.id.canteen2_item1_addButton)
        var addItem6 = findViewById<Button>(R.id.canteen2_item2_addButton)
        var addItem7 = findViewById<Button>(R.id.canteen2_item3_addButton)
        var addItem8 = findViewById<Button>(R.id.canteen2_item4_addButton)

        var removeItem5 = findViewById<Button>(R.id.canteen2_item1_deleteButton)
        var removeItem6 = findViewById<Button>(R.id.canteen2_item2_deleteButton)
        var removeItem7 = findViewById<Button>(R.id.canteen2_item3_deleteButton)
        var removeItem8 = findViewById<Button>(R.id.canteen2_item4_deleteButton)

        var toastAdded = Toast.makeText(getApplicationContext(),"1 item added to cart", Toast.LENGTH_SHORT)
        var toastRemoved = Toast.makeText(getApplicationContext(),"1 item removed to cart", Toast.LENGTH_SHORT)

        cartButton.setOnClickListener{
            val page = Intent(this, CartActivity::class.java)
            startActivity(page)
        }
        addItem5.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 5){
                    it.itemQuantity++
                    toastAdded.show()
                }
            }
        }
        addItem6.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 6){
                    it.itemQuantity++
                    toastAdded.show()
                }
            }
        }
        addItem7.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 7){
                    it.itemQuantity++
                    toastAdded.show()
                }
            }
        }
        addItem8.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 8){
                    it.itemQuantity++
                    toastAdded.show()
                }
            }
        }

        removeItem5.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 5 && it.itemQuantity > 0){
                    it.itemQuantity--
                    toastRemoved.show()
                }
            }
        }
        removeItem6.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 6 && it.itemQuantity > 0){
                    it.itemQuantity--
                    toastRemoved.show()
                }
            }
        }
        removeItem7.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 7 && it.itemQuantity > 0){
                    it.itemQuantity--
                    toastRemoved.show()
                }
            }
        }
        removeItem8.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 8 && it.itemQuantity > 0){
                    it.itemQuantity--
                    toastRemoved.show()
                }
            }
        }
    }
}