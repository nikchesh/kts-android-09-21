package ru.iu3.reddit.Delegates;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0005J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0014J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0014\u00a8\u0006\u0015"}, d2 = {"Lru/iu3/reddit/Delegates/PageLoadingAdapterDelegate;", "Lcom/hannesdorfmann/adapterdelegates4/AbsListItemAdapterDelegate;", "Lru/iu3/reddit/items/LoadingItem;", "", "Lru/iu3/reddit/Delegates/PageLoadingAdapterDelegate$Holder;", "()V", "isForViewType", "", "item", "items", "", "position", "", "onBindViewHolder", "", "holder", "payloads", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "Holder", "app_debug"})
public final class PageLoadingAdapterDelegate extends com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate<ru.iu3.reddit.items.LoadingItem, java.lang.Object, ru.iu3.reddit.Delegates.PageLoadingAdapterDelegate.Holder> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected ru.iu3.reddit.Delegates.PageLoadingAdapterDelegate.Holder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    protected boolean isForViewType(@org.jetbrains.annotations.NotNull()
    java.lang.Object item, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> items, int position) {
        return false;
    }
    
    @java.lang.Override()
    protected void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ru.iu3.reddit.items.LoadingItem item, @org.jetbrains.annotations.NotNull()
    ru.iu3.reddit.Delegates.PageLoadingAdapterDelegate.Holder holder, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    public PageLoadingAdapterDelegate() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lru/iu3/reddit/Delegates/PageLoadingAdapterDelegate$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "(Landroid/view/View;)V", "getContainerView", "()Landroid/view/View;", "app_debug"})
    public static final class Holder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements kotlinx.android.extensions.LayoutContainer {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View containerView = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View getContainerView() {
            return null;
        }
        
        public Holder(@org.jetbrains.annotations.NotNull()
        android.view.View containerView) {
            super(null);
        }
    }
}