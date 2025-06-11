//Tanggal pengerjaan  :
//Nama                :Tiandry Simatupang
//Kelas               :IF.9
//NIM                 :10122342

package com.example.myselfapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Music(
    val name: String,
    val url: Int,
    val imageUrl: String
) : Parcelable
