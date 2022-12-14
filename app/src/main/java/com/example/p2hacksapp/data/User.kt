package com.example.p2hacksapp.data
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo

@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "user_name") val user_name: String?,
    @ColumnInfo(name = "password") val password : String?,
    @ColumnInfo(name = "birthday") val birthday: String?,
)