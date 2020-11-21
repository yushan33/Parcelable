package com.example.parcelable_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val getIntent = intent
        val bundle = intent.getBundleExtra("data")
        val user= bundle?.getParcelable<User>("userData")

        val address = user?.userAddress
        tvUserName.text = user?.userName
        tvUserPw.text = user?.userPassword.toString()
        tvAddressCode.text = address?.number.toString()

        Log.i("address", Gson().toJson(address))
    }
}