    package com.example.projectstructure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

    class MainActivity : AppCompatActivity() {
    val a: Int = 10000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}