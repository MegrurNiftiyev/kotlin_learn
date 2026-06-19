package domain.repositories

interface IAuthRepository {
    suspend fun register(name: String, email: String, password: String)
    suspend fun login(name: String, password: String)
}