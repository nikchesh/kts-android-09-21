package ru.iu3.reddit.parcelable

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class LoginState(
        val valid: Boolean,
): Parcelable