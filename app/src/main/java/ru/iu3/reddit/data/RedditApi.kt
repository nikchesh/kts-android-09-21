package ru.iu3.reddit.data


import retrofit2.Response
import retrofit2.http.*

interface RedditApi {

    @POST("api/vote")
    suspend fun votePost (
        @Field("dir") dir: Int,
        @Field("id") id: String
    ): Response<Unit>


}