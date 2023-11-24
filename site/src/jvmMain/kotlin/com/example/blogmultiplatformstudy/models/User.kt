package com.example.blogmultiplatformstudy.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.litote.kmongo.id.ObjectIdGenerator


@Serializable
data class User(
    val userName: String = "",
    val password: String = "",
    @SerialName(value = "_id")
    val id: String = ObjectIdGenerator.newObjectId<String>().id.toHexString()
)

