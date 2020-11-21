package com.example.parcelable_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val intent = intent
        val bundle = intent.getBundleExtra("data")
        val userData = bundle?.getParcelable<User2>("userData")
        tvUserData.text = Gson().toJson(userData)
    }
}