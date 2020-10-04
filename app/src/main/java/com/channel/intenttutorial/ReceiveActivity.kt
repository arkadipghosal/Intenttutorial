package com.channel.intenttutorial

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.rcvdata.*

class ReceiveActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rcvdata)


        var bundle :Bundle ?=intent.extras
        var message = bundle!!.getString("name") // 1
        var strUser: String = intent.getStringExtra("name") // 2

        rcvtext.setText(strUser)

        implicit.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.google.com/"))
            startActivity(intent)

        }
    }
}