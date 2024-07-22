package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import android.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CartFragment : Fragment() {

    lateinit var cartToolbar: Toolbar
    lateinit var cartRecycleView: RecyclerView
    lateinit var arrayCartItems: ArrayList<CartDetails>
    lateinit var cartadapter: CartItemRecycle
    lateinit var cartCheckoutButton : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cart, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        cartCheckoutButton = view.findViewById(R.id.cartCheckoutButton)
        cartToolbar = view.findViewById(R.id.cartToolbar)
        cartRecycleView = view.findViewById(R.id.cartRecycleView)

        val activity = requireActivity()
        activity.setActionBar(cartToolbar)

        cartToolbar.title="My Cart"

        arrayCartItems = ArrayList()
        arrayCartItems.add(CartDetails(R.drawable.b, "Sunsilk", 550, 3, "ABC"))
        arrayCartItems.add(CartDetails(R.drawable.b, "Sunsilk", 550, 3, "ABC"))
        arrayCartItems.add(CartDetails(R.drawable.b, "Sunsilk", 550, 3, "ABC"))
        arrayCartItems.add(CartDetails(R.drawable.b, "Sunsilk", 550, 3, "ABC"))
        arrayCartItems.add(CartDetails(R.drawable.b, "Sunsilk", 550, 3, "ABC"))
        arrayCartItems.add(CartDetails(R.drawable.b, "Sunsilk", 550, 3, "ABC"))

        cartadapter = CartItemRecycle(requireContext(), arrayCartItems)
        val cartLayoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        cartRecycleView.layoutManager = cartLayoutManager
        cartRecycleView.adapter = cartadapter

        cartCheckoutButton.setOnClickListener {
            val intent = Intent(activity, Checkout::class.java)
            startActivity(intent)
        }
    }
}
