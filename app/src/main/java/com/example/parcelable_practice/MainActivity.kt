package com.example.parcelable_practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.edAddressCode
import kotlinx.android.synthetic.main.activity_main.edUserName
import kotlinx.android.synthetic.main.activity_main.edUserPw

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val userName = edUserName.text.toString()
            val userPW = edUserPw.text.toString().toInt()
            val address = Address(number = edAddressCode.text.toString().toInt())

            val user  = User(userName, userPW, address)
            val bundle =Bundle()
            bundle.putParcelable("userData",user)
            intent.putExtra("data", bundle)
            startActivity(intent)
        }

        btn2.setOnClickListener{
            val intent = Intent(this,MainActivity3::class.java)
            val userName = edUserName.text.toString()
            val userPW = edUserPw.text.toString().toInt()
            val userData = UserData()
            userData.a = "1111"
            userData.b = "2222"
            userData.c = 123

            val user  = User2(userName, userPW, userData)
            val bundle =Bundle()
            bundle.putParcelable("userData",user)
            intent.putExtra("data", bundle)
            startActivity(intent)

        }
    }
}