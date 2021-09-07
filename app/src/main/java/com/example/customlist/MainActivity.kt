package com.example.customlist

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
    //    val names= arrayOf("Oil change", "Car wash", "Pay bills", "Finish homework", "Walk dog", "Clean out closet", "Mow the lawn")
        var list = ArrayList<Model>()

        list.add(Model("Wash car", "Carwash", R.drawable.washingcar))
        list.add(Model("Oil change", "Firestone", R.drawable.oilchange))
        list.add(Model("See movie", "AMC", R.drawable.movie))
        list.add(Model("Make dinner", "Home", R.drawable.cookdinner))
        list.add(Model("Finish homework", "Home", R.drawable.homework))
        list.add(Model("Wash dishes", "Home", R.drawable.washdishes))


        listView.adapter= MyCustomAdapter(this, R.layout.custom_item_layout, list)
//
//        val begin = 1
//
//        listView.setOnItemClickListener { adapterView, view, i, begin, ->
//            Toast.makeText(this, "Item Selected"+ names[i], Toast.LENGTH_LONG)
//                .show()
//        }


    }
}