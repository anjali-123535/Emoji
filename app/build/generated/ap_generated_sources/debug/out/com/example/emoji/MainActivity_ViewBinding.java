// Generated code from Butter Knife. Do not modify!
package com.example.emoji;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view7f080072;

  private View view7f0800ec;

  private View view7f0800d6;

  private View view7f080056;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.mImageView = Utils.findRequiredViewAsType(source, R.id.image_view, "field 'mImageView'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.emojify_button, "field 'mEmojifyButton' and method 'emojifyMe'");
    target.mEmojifyButton = Utils.castView(view, R.id.emojify_button, "field 'mEmojifyButton'", Button.class);
    view7f080072 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.emojifyMe();
      }
    });
    view = Utils.findRequiredView(source, R.id.share_button, "field 'mShareFab' and method 'shareMe'");
    target.mShareFab = Utils.castView(view, R.id.share_button, "field 'mShareFab'", FloatingActionButton.class);
    view7f0800ec = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.shareMe();
      }
    });
    view = Utils.findRequiredView(source, R.id.save_button, "field 'mSaveFab' and method 'saveMe'");
    target.mSaveFab = Utils.castView(view, R.id.save_button, "field 'mSaveFab'", FloatingActionButton.class);
    view7f0800d6 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.saveMe();
      }
    });
    view = Utils.findRequiredView(source, R.id.clear_button, "field 'mClearFab' and method 'clearImage'");
    target.mClearFab = Utils.castView(view, R.id.clear_button, "field 'mClearFab'", FloatingActionButton.class);
    view7f080056 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clearImage();
      }
    });
    target.mTitleTextView = Utils.findRequiredViewAsType(source, R.id.title_text_view, "field 'mTitleTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mImageView = null;
    target.mEmojifyButton = null;
    target.mShareFab = null;
    target.mSaveFab = null;
    target.mClearFab = null;
    target.mTitleTextView = null;

    view7f080072.setOnClickListener(null);
    view7f080072 = null;
    view7f0800ec.setOnClickListener(null);
    view7f0800ec = null;
    view7f0800d6.setOnClickListener(null);
    view7f0800d6 = null;
    view7f080056.setOnClickListener(null);
    view7f080056 = null;
  }
}
