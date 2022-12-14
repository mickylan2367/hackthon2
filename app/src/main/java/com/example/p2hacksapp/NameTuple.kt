package com.example.p2hacksapp

import androidx.room.ColumnInfo

data class NameTuple(
    @ColumnInfo(name = "first_name") val firstName: String?,
    @ColumnInfo(name = "last_name") val lastName: String?
)