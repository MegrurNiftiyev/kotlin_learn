package data.repostories

import domain.repositories.INoteRepository

class NoteRepository: INoteRepository {
    override suspend fun fetchAllNotes() {
        TODO("Not yet implemented")
    }

    override suspend fun fetchNoteById(id: String) {
        TODO("Not yet implemented")
    }

    override suspend fun createNote(text: String) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteNote(id: String) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAllNotes() {
        TODO("Not yet implemented")
    }

    override suspend fun updateNote(id: String, text: String) {
        TODO("Not yet implemented")
    }
}