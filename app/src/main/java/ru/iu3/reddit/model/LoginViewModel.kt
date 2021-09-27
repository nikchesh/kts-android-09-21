package ru.iu3.reddit.model

import android.util.Patterns
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.iu3.reddit.parcelable.LoginState

class LoginViewModel : ViewModel() {
    private val mutableState = MutableLiveData(LoginState(valid = false))

    val state: LiveData<LoginState>
        get() = mutableState

    fun checkValid(passwordInput: String, emailInput: String) {
        val isValidMail = Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()
        val isValidPassword = passwordInput.length >= 8

        if (isValidMail && isValidPassword) {
            mutableState.value = LoginState(true)
        } else
            mutableState.value = LoginState(false)
    }
}