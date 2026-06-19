package data.repostories

import domain.repositories.IAuthRepository

class AuthRepostories : IAuthRepository{
    override suspend fun register(name: String, email: String, password: String) {
        TODO("Not yet implemented")
    }

    override suspend fun login(name: String, password: String) {
        TODO("Not yet implemented")
    }

}