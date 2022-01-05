package com.soulinc.notes.compose

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.soulinc.notes.data.BaseNote
import com.soulinc.notes.data.DescriptionNote
import com.soulinc.notes.data.ExpenseNote

@Composable
fun NotesListScreen(notes: List<BaseNote>) {
    LazyColumn {
        items(notes) { item ->
            when(item) {
                is DescriptionNote -> DescriptionNoteView(note = item)
                is ExpenseNote -> ExpenseNoteView(note = item)
            }
        }
    }
}

@Composable
fun DescriptionNoteView(note: DescriptionNote) {

}

@Composable
fun ExpenseNoteView(note: ExpenseNote) {

}