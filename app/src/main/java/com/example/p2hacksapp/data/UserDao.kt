package com.example.p2hacksapp.data
import androidx.room.Query
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Delete
import androidx.room.Update

@Dao
interface UserDao {
    @Insert
    fun insert(user : User)

    @Update
    fun update(user : User)

    @Delete
    fun delete(user : User)

    @Query("delete from users")
    fun deleteAll()

    @Query("select * from users")
    fun getAll(): List<User>

    @Query("select * from users where id = :id")
    fun getUser(id: Int): User

    @Query("select user_name from users")
//    List(NameTuple??)
    fun loadFullName()
}