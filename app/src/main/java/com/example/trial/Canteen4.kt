package com.example.trial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Canteen4 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.canteen_4_items)

        var cartButton = findViewById<ImageButton>(R.id.cartButton)
        var addItem13 = findViewById<Button>(R.id.canteen4_item1_addButton)
        var addItem14 = findViewById<Button>(R.id.canteen4_item2_addButton)
        var addItem15 = findViewById<Button>(R.id.canteen4_item3_addButton)
        var addItem16 = findViewById<Button>(R.id.canteen4_item4_addButton)

        var removeItem13 = findViewById<Button>(R.id.canteen4_item1_deleteButton)
        var removeItem14 = findViewById<Button>(R.id.canteen4_item2_deleteButton)
        var removeItem15 = findViewById<Button>(R.id.canteen4_item3_deleteButton)
        var removeItem16 = findViewById<Button>(R.id.canteen4_item4_deleteButton)

        var toastAdded = Toast.makeText(getApplicationContext(),"1 item added to cart", Toast.LENGTH_SHORT)
        var toastRemoved = Toast.makeText(getApplicationContext(),"1 item removed to cart", Toast.LENGTH_SHORT)


        cartButton.setOnClickListener{
            val page = Intent(this, CartActivity::class.java)
            startActivity(page)
        }

        addItem13.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 13){
                    it.itemQuantity++
                    toastAdded.show()
                }
            }
        }
        addItem14.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 14){
                    it.itemQuantity++
                    toastAdded.show()
                }
            }
        }
        addItem15.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 15){
                    it.itemQuantity++
                    toastAdded.show()
                }
            }
        }
        addItem16.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 16){
                    it.itemQuantity++
                    toastAdded.show()
                }
            }
        }

        removeItem13.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 13 && it.itemQuantity > 0){
                    it.itemQuantity--
                    toastRemoved.show()
                }
            }
        }
        removeItem14.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 14 && it.itemQuantity > 0){
                    it.itemQuantity--
                    toastRemoved.show()
                }
            }
        }
        removeItem15.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 15 && it.itemQuantity > 0){
                    it.itemQuantity--
                    toastRemoved.show()
                }
            }
        }
        removeItem16.setOnClickListener{
            CartProvider.CART_LIST.forEach{
                if(it.id == 16 && it.itemQuantity > 0){
                    it.itemQuantity--
                    toastRemoved.show()
                }
            }
        }
    }
}