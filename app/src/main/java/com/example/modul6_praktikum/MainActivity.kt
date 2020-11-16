package com.example.modul6_praktikum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.modul6_praktikum.R
import com.example.modul6_praktikum.adapter
import com.example.modul6_praktikum.data
import com.example.modul6_praktikum.phone_detail
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textData = createPhoneData()
        rv_part.layoutManager = LinearLayoutManager(this)
        rv_part.setHasFixedSize(true)
        rv_part.adapter = adapter(textData, { phoneItem : data -> phoneItemClicked(phoneItem) })
    }

    private fun phoneItemClicked(phoneItem : data) {
        val showDetailActivityIntent = Intent(this, phone_detail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, phoneItem.phone.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, phoneItem.contactName)
        startActivity(showDetailActivityIntent)

    }

    private fun createPhoneData(): List<data> {
        val partList = ArrayList<data>()
        partList.add(data(11294850,"Alpha"))
        partList.add(data(935001238,"Bravo"))
        partList.add(data(99204810,"Charlie"))
        return partList
    }
}