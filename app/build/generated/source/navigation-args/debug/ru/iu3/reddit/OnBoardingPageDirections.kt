package ru.iu3.reddit

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class OnBoardingPageDirections private constructor() {
  public companion object {
    public fun actionSalutionFragmentToLoginFragment3(): NavDirections =
        ActionOnlyNavDirections(R.id.action_salutionFragment_to_loginFragment3)
  }
}
