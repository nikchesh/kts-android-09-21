package ru.iu3.reddit.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.iu3.reddit.parcelable.LoginState

class LoginViewModel : ViewModel() {
    private val mutableState = MutableLiveData(LoginState(inputEmail = "", inputPassword = ""))

    val state: LiveData<LoginState>
        get() = mutableState

    fun updateInformation(mail: String, password: String) {
        mutableState.value = LoginState(mail, password)
    }

/*
    fun updateInformation(newEmail : String, newPassword : String){
        mutableState.value = LoginState(inputEmail = newEmail, inputPassword = newPassword)
    }

 */

}