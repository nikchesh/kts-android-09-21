package ru.iu3.reddit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\"\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006 "}, d2 = {"Lru/iu3/reddit/LoginPage;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lru/iu3/reddit/databinding/FragmentAuthorizationBinding;", "getBinding", "()Lru/iu3/reddit/databinding/FragmentAuthorizationBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "viewModel", "Lru/iu3/reddit/model/LoginViewModel;", "getViewModel", "()Lru/iu3/reddit/model/LoginViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindViewModel", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "openAuthPage", "intent", "updateIsLoading", "isLoading", "", "Companion", "app_debug"})
public final class LoginPage extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    private static final int AUTH_REQUEST_CODE = 342;
    @org.jetbrains.annotations.NotNull()
    public static final ru.iu3.reddit.LoginPage.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final ru.iu3.reddit.model.LoginViewModel getViewModel() {
        return null;
    }
    
    private final ru.iu3.reddit.databinding.FragmentAuthorizationBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void bindViewModel() {
    }
    
    private final void updateIsLoading(boolean isLoading) {
    }
    
    private final void openAuthPage(android.content.Intent intent) {
    }
    
    public LoginPage() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lru/iu3/reddit/LoginPage$Companion;", "", "()V", "AUTH_REQUEST_CODE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}