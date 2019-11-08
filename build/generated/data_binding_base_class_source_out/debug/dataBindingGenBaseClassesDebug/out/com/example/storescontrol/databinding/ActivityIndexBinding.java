// Generated by data binding compiler. Do not edit!
package com.example.storescontrol.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.example.storescontrol.R;
import com.example.storescontrol.bean.LoginBean;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityIndexBinding extends ViewDataBinding {
  @NonNull
  public final Button bExit;

  @NonNull
  public final LinearLayout lBottom;

  @NonNull
  public final RelativeLayout lInfo;

  @NonNull
  public final View lTitle;

  @NonNull
  public final RecyclerView rvFunction;

  @NonNull
  public final TextView tvAccname;

  @NonNull
  public final TextView tvUsername;

  @Bindable
  protected LoginBean mUser;

  protected ActivityIndexBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button bExit, LinearLayout lBottom, RelativeLayout lInfo, View lTitle,
      RecyclerView rvFunction, TextView tvAccname, TextView tvUsername) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bExit = bExit;
    this.lBottom = lBottom;
    this.lInfo = lInfo;
    this.lTitle = lTitle;
    this.rvFunction = rvFunction;
    this.tvAccname = tvAccname;
    this.tvUsername = tvUsername;
  }

  public abstract void setUser(@Nullable LoginBean user);

  @Nullable
  public LoginBean getUser() {
    return mUser;
  }

  @NonNull
  public static ActivityIndexBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_index, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityIndexBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityIndexBinding>inflateInternal(inflater, R.layout.activity_index, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityIndexBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_index, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityIndexBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityIndexBinding>inflateInternal(inflater, R.layout.activity_index, null, false, component);
  }

  public static ActivityIndexBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityIndexBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityIndexBinding)bind(component, view, R.layout.activity_index);
  }
}