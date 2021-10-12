package ru.iu3.reddit.data.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lru/iu3/reddit/data/config/AuthConfig;", "", "()V", "AUTH_URI", "", "CALLBACK_URL", "CLIENT_ID", "CLIENT_SECRET", "RESPONSE_TYPE", "SCOPE", "TOKEN_URI", "token", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "app_debug"})
public final class AuthConfig {
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String token;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUTH_URI = "https://ssl.reddit.com/api/v1/authorize.compact";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOKEN_URI = "https://ssl.reddit.com/api/v1/access_token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESPONSE_TYPE = "code";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SCOPE = "read identity vote save";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLIENT_ID = "ImFrSvl28AsxqsNeSGKJxA";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLIENT_SECRET = "";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALLBACK_URL = "school://kts.studio/callback";
    @org.jetbrains.annotations.NotNull()
    public static final ru.iu3.reddit.data.config.AuthConfig INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    private AuthConfig() {
        super();
    }
}