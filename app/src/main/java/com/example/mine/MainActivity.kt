package com.example.mine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.signupBtn).setOnClickListener{signup()}

    }
    private fun signup(){
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)

    }
}