package com.soulinc.notes.data

data class DescriptionNote(
    override val id: String,
    override val title: String,
    val description: String
): BaseNote