package domain.repositories

interface IUserRepostory {
    suspend fun fetchUser()
    suspend fun updateUser(name: String, email: String)
    suspend fun deleteUser()
}