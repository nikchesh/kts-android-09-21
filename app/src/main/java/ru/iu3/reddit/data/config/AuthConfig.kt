package ru.iu3.reddit.data.config

import net.openid.appauth.ResponseTypeValues

object AuthConfig {
    var token: String? = null
    const val AUTH_URI = "https://ssl.reddit.com/api/v1/authorize.compact"
    const val TOKEN_URI = "https://ssl.reddit.com/api/v1/access_token"
    const val RESPONSE_TYPE = ResponseTypeValues.CODE
    const val SCOPE = "read identity vote save"

    const val CLIENT_ID = "Cheshov"
    const val CLIENT_SECRET = "ImFrSvl28AsxqsNeSGKJxA"
    const val CALLBACK_URL = "school://kts.studio/callback"
}