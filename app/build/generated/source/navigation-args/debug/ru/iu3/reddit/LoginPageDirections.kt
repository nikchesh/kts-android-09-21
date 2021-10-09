package ru.iu3.reddit

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class LoginPageDirections private constructor() {
  public companion object {
    public fun actionLoginFragmentToMainPage(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_mainPage)
  }
}
