package com.example.blogmultiplatformstudy.data

import com.example.blogmultiplatformstudy.models.User

interface MongoRepository {
    suspend fun checkUserExistence(user: User): User?
}