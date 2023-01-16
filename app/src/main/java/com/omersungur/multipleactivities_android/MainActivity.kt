package com.omersungur.multipleactivities_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var editText : EditText
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
    }

    fun changeActivity(view : View) {
        val intent : Intent = Intent(this,SecondScreen::class.java)
        intent.putExtra("userName",editText.text.toString()) // veriyi diğer aktiviteye yollamak için putExtra kullandık.
        startActivity(intent)
    }
}