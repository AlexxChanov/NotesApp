package com.example.notesapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import com.example.notesapp.R
import com.example.notesapp.data.NoteRepository
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity(), CoroutineScope {
    override val coroutineContext: CoroutineContext=Dispatchers.Main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer,NavFragment())
            .commit()

//        val repo = NoteRepository()
//
//        createNew.setOnClickListener {
//            val title = noteTitle.text.toString()
//            val text = noteText.text.toString()
//
//            if (title.isNotBlank()&& text.isNotBlank()) {
//                launch {
//                val id = repo.createNewNote(title,text)
//                Toast.makeText(applicationContext,"Inserted with id $id", Toast.LENGTH_LONG).show()
//            }
//            }
//        }
//        notesList.setOnClickListener {
//            launch {
//                Log.i("Notes", repo.getAllNotes().toString())
//            }
        }

    }

