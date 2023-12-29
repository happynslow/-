package com.example.courseregistration.domain.user.dto

data class UserResponse(
    val id: String,
    val email: String,
    val nickname: String,
    val role: String
)
