package com.soulinc.notes.data

data class ExpenseNote(
    override val id: String,
    override val title: String,
    val expenses: List<Expense>
) : BaseNote