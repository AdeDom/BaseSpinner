package com.adedom.basespinner

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner.adapter = CountryAdapter(baseContext, initList())
        spinner.onItemSelected<CountryItem> {
            Toast.makeText(baseContext, "$it selected", Toast.LENGTH_SHORT).show()
        }
    }

    private fun initList(): MutableList<CountryItem> {
        val list = mutableListOf<CountryItem>()
        list.add(CountryItem("India", R.drawable.ic_launcher_background))
        list.add(CountryItem("China", R.drawable.ic_launcher_background))
        list.add(CountryItem("USA", R.drawable.ic_launcher_background))
        list.add(CountryItem("Germany", R.drawable.ic_launcher_background))
        return list
    }

}
