// Generated by view binder compiler. Do not edit!
package ru.iu3.reddit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ru.iu3.reddit.R;

public final class ItemSimpleBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView author;

  @NonNull
  public final ImageView like;

  @NonNull
  public final TextView title;

  @NonNull
  public final TextView votes;

  private ItemSimpleBinding(@NonNull ConstraintLayout rootView, @NonNull TextView author,
      @NonNull ImageView like, @NonNull TextView title, @NonNull TextView votes) {
    this.rootView = rootView;
    this.author = author;
    this.like = like;
    this.title = title;
    this.votes = votes;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemSimpleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemSimpleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_simple, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemSimpleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.author;
      TextView author = rootView.findViewById(id);
      if (author == null) {
        break missingId;
      }

      id = R.id.like;
      ImageView like = rootView.findViewById(id);
      if (like == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = rootView.findViewById(id);
      if (title == null) {
        break missingId;
      }

      id = R.id.votes;
      TextView votes = rootView.findViewById(id);
      if (votes == null) {
        break missingId;
      }

      return new ItemSimpleBinding((ConstraintLayout) rootView, author, like, title, votes);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
