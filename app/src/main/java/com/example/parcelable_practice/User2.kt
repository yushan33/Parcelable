package com.example.parcelable_practice

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User2(
    val userName: String,
    val userPassword: Int,
    val userData: UserData
):Parcelable