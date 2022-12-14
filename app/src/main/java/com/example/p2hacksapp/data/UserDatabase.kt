package com.example.p2hacksapp.data
import androidx.room.Database
import androidx.room.RoomDatabase

// roomの使い方：https://developer.android.com/training/data-storage/room?hl=ja#kotlin

//クラスに一つ歯科PB雨ジェクトを生成できないもの（companion : singleton??）：https://qiita.com/tkhs0604/items/261e94a42b7097dfd204


@Database(entities = [User::class], version = 1)
abstract class UserDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}