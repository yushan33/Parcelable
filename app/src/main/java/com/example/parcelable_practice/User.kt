package com.example.parcelable_practice

import android.os.Parcel
import android.os.Parcelable

data class User(
    val userName: String?,
    val userPassword:Int,
    val userAddress: Address?
): Parcelable {
    constructor(parcel: Parcel) : this(
        userName = parcel.readString(),
        userPassword = parcel.readInt(),
        userAddress = parcel.readParcelable(Address::class.java.classLoader)
    )


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(userName)
        parcel.writeInt(userPassword)
        parcel.writeParcelable(userAddress, flags)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
}

