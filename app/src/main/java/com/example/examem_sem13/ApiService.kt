package com.example.examem_sem13
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("list/teacher")
    suspend fun getTeachers(): Response<TeacherListResponse>
}