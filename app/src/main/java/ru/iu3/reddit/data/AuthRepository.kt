package ru.iu3.reddit.data

import android.net.Uri
import net.openid.appauth.*
import ru.iu3.reddit.data.config.AuthConfig

class AuthRepository {

    fun getAuthRequest(): AuthorizationRequest {
        val serviceConfiguration = AuthorizationServiceConfiguration(
            Uri.parse(AuthConfig.AUTH_URI),
            Uri.parse(AuthConfig.TOKEN_URI)
        )

        val redirectUri = Uri.parse(AuthConfig.CALLBACK_URL)

        return AuthorizationRequest.Builder(
            serviceConfiguration,
            AuthConfig.CLIENT_ID,
            AuthConfig.RESPONSE_TYPE,
            redirectUri
        )
            .setScope(AuthConfig.SCOPE)
            .build()
    }

    fun performTokenRequest(
        authService: AuthorizationService,
        tokenRequest: TokenRequest,
        onComplete: () -> Unit,
        onError: () -> Unit
    ) {
        authService.performTokenRequest(tokenRequest, ClientSecretBasic(AuthConfig.CLIENT_SECRET)) { response, ex ->
            when {
                response != null -> {
                    AuthConfig.token = response.accessToken.orEmpty()
                    onComplete()
                }
                else -> onError()
            }
        }
    }
}