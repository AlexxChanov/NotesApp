package com.example.notesapp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.notesapp.R
import com.example.notesapp.data.Note
import kotlinx.android.synthetic.main.fragment_navigation.view.*
import kotlinx.android.synthetic.main.notes_list_item.view.*

class NotesAdapter (
    val notes: List<Note>
): RecyclerView.Adapter<NotesAdapter.NotesHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesAdapter.NotesHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.notes_list_item, parent, false)
        return NotesHolder(view)
    }

    override fun getItemCount()=notes.size

    override fun onBindViewHolder(holder: NotesAdapter.NotesHolder, position: Int) {
        holder.bind(notes[position])
    }

    class NotesHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun bind(note: Note)=itemView.apply {
            notesTitle.text = note.title
            notesText.text = note.text
        }

    }

}