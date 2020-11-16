package com.example.modul6_praktikum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity.*

class phone_detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)
        var intentThatStartedThisActivity = getIntent()

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var partId = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            var partId2 = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var partId3 = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            tv_item_id.text = partId
            tv_item_id2.text = partId2
        }
    }
}