package data.repostories

import domain.repositories.IUserRepostory

class UserRepostory: IUserRepostory{
    override suspend fun fetchUser() {
        TODO("Not yet implemented")
    }

    override suspend fun updateUser(name: String, email: String) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteUser() {
        TODO("Not yet implemented")
    }

}