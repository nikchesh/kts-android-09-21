package ru.iu3.reddit.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020\u000bH\u0014J\u0006\u0010%\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\rR\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00110\u00110\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\rR\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\rR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lru/iu3/reddit/model/LoginViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "authRepository", "Lru/iu3/reddit/data/AuthRepository;", "authService", "Lnet/openid/appauth/AuthorizationService;", "authSuccessLiveData", "Landroidx/lifecycle/LiveData;", "", "getAuthSuccessLiveData", "()Landroidx/lifecycle/LiveData;", "authSuccessLiveEvent", "Lru/iu3/reddit/utils/SingleLiveEvent;", "loadingLiveData", "", "getLoadingLiveData", "loadingMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "openAuthPageLiveData", "Landroid/content/Intent;", "getOpenAuthPageLiveData", "openAuthPageLiveEvent", "toastLiveData", "", "getToastLiveData", "toastLiveEvent", "onAuthCodeFailed", "exception", "Lnet/openid/appauth/AuthorizationException;", "onAuthCodeReceived", "tokenRequest", "Lnet/openid/appauth/TokenRequest;", "onCleared", "openLoginPage", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.AndroidViewModel {
    private final ru.iu3.reddit.data.AuthRepository authRepository = null;
    private final net.openid.appauth.AuthorizationService authService = null;
    private final ru.iu3.reddit.utils.SingleLiveEvent<android.content.Intent> openAuthPageLiveEvent = null;
    private final ru.iu3.reddit.utils.SingleLiveEvent<java.lang.Integer> toastLiveEvent = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loadingMutableLiveData = null;
    private final ru.iu3.reddit.utils.SingleLiveEvent<kotlin.Unit> authSuccessLiveEvent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<android.content.Intent> getOpenAuthPageLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLoadingLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getToastLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Unit> getAuthSuccessLiveData() {
        return null;
    }
    
    public final void onAuthCodeFailed(@org.jetbrains.annotations.NotNull()
    net.openid.appauth.AuthorizationException exception) {
    }
    
    public final void onAuthCodeReceived(@org.jetbrains.annotations.NotNull()
    net.openid.appauth.TokenRequest tokenRequest) {
    }
    
    public final void openLoginPage() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}