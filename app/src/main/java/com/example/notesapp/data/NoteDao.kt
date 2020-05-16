package com.example.notesapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {
    @Insert
    fun insertNote(note: Note): Long
    @Delete
    fun deleteNote(note: Note)
    @Query("select*from notes")//* значит что нужно получить все поля
    fun getAllNotes(): List<Note>
}