// Generated by view binder compiler. Do not edit!
package ru.iu3.reddit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ru.iu3.reddit.R;

public final class FragmentAuthorizationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonLogin;

  @NonNull
  public final TextInputEditText inputLogin;

  @NonNull
  public final TextInputEditText inputPassword;

  @NonNull
  public final TextInputLayout textLogin;

  @NonNull
  public final TextInputLayout textPassword;

  @NonNull
  public final TextView textView;

  private FragmentAuthorizationBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button buttonLogin, @NonNull TextInputEditText inputLogin,
      @NonNull TextInputEditText inputPassword, @NonNull TextInputLayout textLogin,
      @NonNull TextInputLayout textPassword, @NonNull TextView textView) {
    this.rootView = rootView;
    this.buttonLogin = buttonLogin;
    this.inputLogin = inputLogin;
    this.inputPassword = inputPassword;
    this.textLogin = textLogin;
    this.textPassword = textPassword;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAuthorizationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAuthorizationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_authorization, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAuthorizationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonLogin;
      Button buttonLogin = rootView.findViewById(id);
      if (buttonLogin == null) {
        break missingId;
      }

      id = R.id.inputLogin;
      TextInputEditText inputLogin = rootView.findViewById(id);
      if (inputLogin == null) {
        break missingId;
      }

      id = R.id.inputPassword;
      TextInputEditText inputPassword = rootView.findViewById(id);
      if (inputPassword == null) {
        break missingId;
      }

      id = R.id.textLogin;
      TextInputLayout textLogin = rootView.findViewById(id);
      if (textLogin == null) {
        break missingId;
      }

      id = R.id.textPassword;
      TextInputLayout textPassword = rootView.findViewById(id);
      if (textPassword == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = rootView.findViewById(id);
      if (textView == null) {
        break missingId;
      }

      return new FragmentAuthorizationBinding((ConstraintLayout) rootView, buttonLogin, inputLogin,
          inputPassword, textLogin, textPassword, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
