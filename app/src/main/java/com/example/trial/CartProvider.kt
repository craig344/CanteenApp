package com.example.trial

object CartProvider {
    val CART_LIST : MutableList<Cart> = ArrayList()

    var id_counter : Int = 1

    fun initCart() : MutableList<Cart>{
        CART_LIST.add(Cart(id_counter++, "Burger 1", "@drawable/canteen1_item1", 40, 0))
        CART_LIST.add(Cart(id_counter++, "Burger 2", "@drawable/canteen1_item2", 40, 0))
        CART_LIST.add(Cart(id_counter++, "Burger 3", "@drawable/canteen1_item3", 40, 0))
        CART_LIST.add(Cart(id_counter++, "Burger 4", "@drawable/canteen1_item4", 40, 0))

        CART_LIST.add(Cart(id_counter++, "Pizza 1", "@drawable/canteen2_item1", 40, 0))
        CART_LIST.add(Cart(id_counter++, "Pizza 2", "@drawable/canteen2_item2", 40, 0))
        CART_LIST.add(Cart(id_counter++, "Pizza 3", "@drawable/canteen2_item3", 40, 0))
        CART_LIST.add(Cart(id_counter++, "Pizza 4", "@drawable/canteen2_item4", 40, 0))

        CART_LIST.add(Cart(id_counter++, "Waffle 1", "@drawable/canteen3_item1", 40, 0))
        CART_LIST.add(Cart(id_counter++, "Waffle 2", "@drawable/canteen3_item2", 40, 0))
        CART_LIST.add(Cart(id_counter++, "Waffle 3", "@drawable/canteen3_item3", 40, 0))
        CART_LIST.add(Cart(id_counter++, "Waffle 4", "@drawable/canteen3_item4", 40, 0))

        CART_LIST.add(Cart(id_counter++, "IceCream 1", "@drawable/canteen4_item1", 40, 0))
        CART_LIST.add(Cart(id_counter++, "IceCream 2", "@drawable/canteen4_item2", 40, 0))
        CART_LIST.add(Cart(id_counter++, "IceCream 3", "@drawable/canteen4_item3", 40, 0))
        CART_LIST.add(Cart(id_counter++, "IceCream 4", "@drawable/canteen4_item4", 40, 0))

        return CART_LIST
    }
}