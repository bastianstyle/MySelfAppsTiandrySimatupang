//Tanggal pengerjaan  :
//Nama                :Tiandry Simatupang
//Kelas               :IF.9
//NIM                 :10122342

package com.example.myselfapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Friend(
    val name: String,
    val image: Int,
): Parcelable