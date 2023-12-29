package com.example.courseregistration.domain.course.dto

data class CreateCourseRequest(
    val title: String,
    val description: String?
)