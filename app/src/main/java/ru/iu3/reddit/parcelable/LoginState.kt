package ru.iu3.reddit.parcelable

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class LoginState(
        val valid: Boolean,
) : Parcelable