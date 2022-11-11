package com.example.contextdemo

import android.os.Parcel
import android.os.Parcelable

data class DemoParcelable(
    val text: String?,
    val id: Int
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(parcel: Parcel?, i: Int) {
        parcel?.writeString(text)
        parcel?.writeInt(id)
    }

    companion object CREATOR : Parcelable.Creator<DemoParcelable> {
        override fun createFromParcel(parcel: Parcel): DemoParcelable {
            return DemoParcelable(parcel)
        }

        override fun newArray(size: Int): Array<DemoParcelable?> {
            return arrayOfNulls(size)
        }
    }
}