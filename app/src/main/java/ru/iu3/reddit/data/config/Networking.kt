package ru.iu3.reddit.data.config

import okhttp3.OkHttpClient
import okhttp3.Interceptor
import okhttp3.OkHttpClient.Builder
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import ru.iu3.reddit.data.RedditApi


    object Networking {

        private val okhttpClient = OkHttpClient.Builder()
            .addNetworkInterceptor(
                HttpLoggingInterceptor {
                }
                    .setLevel(HttpLoggingInterceptor.Level.BODY)
            )
            .build()

        private val retrofit = Retrofit.Builder()
            .baseUrl("https://oauth.reddit.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .client(okhttpClient)
            .build()

        val redditApi: RedditApi
            get() = retrofit.create()
}
