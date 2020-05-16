package com.example.notesapp

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.notesapp.data.AppDatabase

class NotesApplication: Application() {
    companion object{
        lateinit var db:AppDatabase
    }

    override fun onCreate() {
        super.onCreate()

        db = Room.databaseBuilder(
            this,
            AppDatabase::class.java,
            "main").build()
    }
}