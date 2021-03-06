package com.example.dinnerdecider



import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese","Hamburger","In 'n Out Burger","Pizza","McDonalds","Barros Pizza","Sushi","Vegan","Pan Asian","Korean","French Cuisine","Steak & Chips","Indian")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val decideBtn = findViewById(R.id.decideButton) as Button
        val selectedFoodTxt = findViewById(R.id.selectedFoodText) as TextView
        val addFoodTxt = findViewById(R.id.addFoodText) as TextView
        val addFoodBtn = findViewById(R.id.addFoodButton) as Button

        decideBtn.setOnClickListener {
            // your code to perform when the user clicks on the button
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList [randomFood]
        }

        addFoodTxt.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            foodList.add(newFood)
            println(foodList)

        }

        addFoodBtn.setOnClickListener {
            addFoodTxt.setText("")
        }


    }


}