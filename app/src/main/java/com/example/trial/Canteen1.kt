package com.example.trial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Canteen1 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.canteen_1_items)

        var cartButton = findViewById<ImageButton>(R.id.cartButton)
        var addItem1 = findViewById<Button>(R.id.canteen1_item1_addButton)
        var addItem2 = findViewById<Button>(R.id.canteen1_item2_addButton)
        var addItem3 = findViewById<Button>(R.id.canteen1_item3_addButton)
        var addItem4 = findViewById<Button>(R.id.canteen1_item4_addButton)

        var removeItem1 = findViewById<Button>(R.id.canteen1_item1_deleteButton)
        var removeItem2 = findViewById<Button>(R.id.canteen1_item2_deleteButton)
        var removeItem3 = findViewById<Button>(R.id.canteen1_item3_deleteButton)
        var removeItem4 = findViewById<Button>(R.id.canteen1_item4_deleteButton)

        var toastAdded = Toast.makeText(getApplicationContext(),"1 item added to cart", Toast.LENGTH_SHORT)
        var toastRemoved = Toast.makeText(getApplicationContext(),"1 item removed to cart", Toast.LENGTH_SHORT)

        cartButton.setOnClickListener{
            val page = Intent(this, CartActivity::class.java)
            startActivity(page)
        }

        addItem1.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 1){
                    it.itemQuantity++
                    toastAdded.show()
                }
            }
        }
        addItem2.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 2){
                    it.itemQuantity++
                    toastAdded.show()
                }
            }
        }
        addItem3.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 3){
                    it.itemQuantity++
                    toastAdded.show()
                }
            }
        }
        addItem4.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 4){
                    it.itemQuantity++
                    toastAdded.show()
                }
            }
        }

        removeItem1.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 1 && it.itemQuantity > 0){
                    it.itemQuantity--
                    toastRemoved.show()
                }
            }
        }
        removeItem2.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 2 && it.itemQuantity > 0){
                    it.itemQuantity--
                    toastRemoved.show()
                }
            }
        }
        removeItem3.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 3 && it.itemQuantity > 0){
                    it.itemQuantity--
                    toastRemoved.show()
                }
            }
        }
        removeItem4.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 4 && it.itemQuantity > 0){
                    it.itemQuantity--
                    toastRemoved.show()
                }
            }
        }
    }
}