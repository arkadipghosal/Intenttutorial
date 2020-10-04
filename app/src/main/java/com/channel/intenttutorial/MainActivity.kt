package com.channel.intenttutorial

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.rcvdata.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        senddata.setOnClickListener {
            if(etusername.text.toString().equals("")){

                Toast.makeText(applicationContext,"Username required",Toast.LENGTH_SHORT).show()
            }
            else{

                intent = Intent(this, ReceiveActivity::class.java)
                intent.putExtra("name", etusername.text.toString())
                startActivity(intent)
            }
        }



    }
}