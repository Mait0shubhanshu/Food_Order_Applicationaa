package com.example.foodorderapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodorderapplication.databinding.ActivityOrderBinding


    private lateinit var binding: ActivityOrderBinding

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val orderOfCustomer = intent.getStringExtra(MainActivity.ord)
        binding.viewOrder.text = "Order Placed" + orderOfCustomer.toString()
    }
}
