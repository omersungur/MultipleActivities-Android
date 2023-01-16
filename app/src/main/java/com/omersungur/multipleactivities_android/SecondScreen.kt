package com.omersungur.multipleactivities_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class SecondScreen : AppCompatActivity() {

    lateinit var textView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        textView = findViewById(R.id.textView3)
        //val intent : Intent = intent
        var username : String? = intent.getStringExtra("userName") // diğer aktiviteden veriyi çekebilmek için getStringExtra kullanıyoruz
        textView.text = username
    }

    fun changeActivity(view : View) {
        val intent : Intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}