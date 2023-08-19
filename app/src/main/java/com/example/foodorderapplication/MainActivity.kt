package com.example.foodorderapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodorderapplication.databinding.ActivityMainBinding


private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Creating Companion obj
    companion object{
        const val ord = "com.example.food order application.ord"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Creating Companion obj

        binding.btnOrder.setOnClickListener{
            val orderPlace = binding.edt1.text.toString() + " " + binding.edt2.text.toString() + binding.edt3.text.toString() + " " + binding.edt4.text.toString()

            intent = Intent(this, OrderActivity::class.java)
            intent.putExtra(ord, orderPlace)
            startActivity(intent)
        }
    }
}