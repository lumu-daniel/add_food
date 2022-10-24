package com.ktn.food_selector

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktn.food_selector.databinding.ActivityMainBinding
import java.util.StringJoiner


class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding
    private val foodTypes: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
        addFoods()
        listners()
    }

    private fun listners() {
        activityMainBinding.decide.setOnClickListener{
            activityMainBinding.foodTv.setText(foodTypes[(0 until foodTypes.size).random()])
        }
        activityMainBinding.addFood.setOnClickListener{
            foodTypes.add(activityMainBinding.addFoodEt.text.toString())
        }
    }

    private fun addFoods(){
        foodTypes.add("Hamburger")
        foodTypes.add("Pizza")
        foodTypes.add("Mexican")
        foodTypes.add("American")
        foodTypes.add("Chinese")
    }
}