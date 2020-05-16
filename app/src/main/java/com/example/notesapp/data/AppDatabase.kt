package com.example.notesapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Note::class],version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun getNoteDao(): NoteDao
}