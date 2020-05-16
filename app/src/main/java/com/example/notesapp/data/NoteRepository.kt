package com.example.notesapp.data

import android.icu.text.CaseMap
import com.example.notesapp.NotesApplication
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext
class NoteRepository {
   private val coroutineContext: CoroutineContext=Dispatchers.IO

    private val noteDao = NotesApplication.db.getNoteDao()
    suspend fun createNewNote(title: String,text: String) =
        withContext(coroutineContext){
        noteDao.insertNote(Note(title,text))

        }

    suspend fun getAllNotes() = withContext(coroutineContext){
        noteDao.getAllNotes()
    }
}

