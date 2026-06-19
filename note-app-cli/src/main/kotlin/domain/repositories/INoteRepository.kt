package domain.repositories

interface INoteRepository {
    suspend fun fetchAllNotes()
    suspend fun fetchNoteById(id: String)
    suspend fun createNote(text: String)
    suspend fun deleteNote(id: String)
    suspend fun deleteAllNotes()
    suspend fun updateNote(id: String, text: String)
}