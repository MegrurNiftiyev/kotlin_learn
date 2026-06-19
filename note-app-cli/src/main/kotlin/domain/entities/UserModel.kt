package domain.entities

import domain.entities.interfaces.Identifiable
import domain.entities.interfaces.Timestamped
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserModelDto(
    @SerialName("_id") val _id: String,
    val name: String,
    val email: String,
    val created: String
)