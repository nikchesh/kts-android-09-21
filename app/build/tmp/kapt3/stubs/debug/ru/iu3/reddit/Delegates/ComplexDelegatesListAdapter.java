package ru.iu3.reddit.Delegates;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lru/iu3/reddit/Delegates/ComplexDelegatesListAdapter;", "Lcom/hannesdorfmann/adapterdelegates4/AsyncListDifferDelegationAdapter;", "", "onOpenInBrowser", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "ComplexDiffCallback", "app_debug"})
public final class ComplexDelegatesListAdapter extends com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter<java.lang.Object> {
    
    public ComplexDelegatesListAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> onOpenInBrowser) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0017J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lru/iu3/reddit/Delegates/ComplexDelegatesListAdapter$ComplexDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "", "()V", "areContentsTheSame", "", "first", "second", "areItemsTheSame", "app_debug"})
    public static final class ComplexDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<java.lang.Object> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        java.lang.Object first, @org.jetbrains.annotations.NotNull()
        java.lang.Object second) {
            return false;
        }
        
        @android.annotation.SuppressLint(value = {"DiffUtilEquals"})
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        java.lang.Object first, @org.jetbrains.annotations.NotNull()
        java.lang.Object second) {
            return false;
        }
        
        public ComplexDiffCallback() {
            super();
        }
    }
}