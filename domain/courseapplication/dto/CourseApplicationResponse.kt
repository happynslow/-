package com.example.courseregistration.domain.courseapplication.dto

import com.example.courseregistration.domain.course.dto.CourseResponse
import com.example.courseregistration.domain.user.dto.UserResponse

data class CourseApplicationResponse (
    val id: Long,
    val course: CourseResponse,
    val user: UserResponse,
    val status: String

)
