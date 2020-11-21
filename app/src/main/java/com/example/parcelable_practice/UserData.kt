package com.example.parcelable_practice

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserData(
    var a: String = "aaa",
    var b: String = "bbb",
    var c: Int = 123
):Parcelable