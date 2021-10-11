package ru.iu3.reddit.Delegates;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0018B(\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\u0002\u0010\u000bJ&\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J*\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0003R\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0014J\u0014\u0010\u0015\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017H\u0014R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lru/iu3/reddit/Delegates/ComplexItemDelegate;", "Lcom/hannesdorfmann/adapterdelegates4/AbsListItemAdapterDelegate;", "", "Lru/iu3/reddit/Delegates/ComplexItemDelegate$ViewHolder;", "onItemClick", "Lkotlin/Function1;", "Lru/iu3/reddit/items/ComplexItem;", "Lkotlin/ParameterName;", "name", "item", "", "(Lkotlin/jvm/functions/Function1;)V", "isForViewType", "", "items", "", "position", "", "onBindViewHolder", "viewHolder", "payloads", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "ViewHolder", "app_debug"})
public final class ComplexItemDelegate extends com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate<java.lang.Object, java.lang.Object, ru.iu3.reddit.Delegates.ComplexItemDelegate.ViewHolder> {
    private final kotlin.jvm.functions.Function1<ru.iu3.reddit.items.ComplexItem, kotlin.Unit> onItemClick = null;
    
    @java.lang.Override()
    protected boolean isForViewType(@org.jetbrains.annotations.NotNull()
    java.lang.Object item, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> items, int position) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected ru.iu3.reddit.Delegates.ComplexItemDelegate.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    protected void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    java.lang.Object item, @org.jetbrains.annotations.NotNull()
    ru.iu3.reddit.Delegates.ComplexItemDelegate.ViewHolder viewHolder, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    public ComplexItemDelegate(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ru.iu3.reddit.items.ComplexItem, kotlin.Unit> onItemClick) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B0\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R)\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lru/iu3/reddit/Delegates/ComplexItemDelegate$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "onItemClick", "Lkotlin/Function1;", "Lru/iu3/reddit/items/ComplexItem;", "Lkotlin/ParameterName;", "name", "item", "", "(Lru/iu3/reddit/Delegates/ComplexItemDelegate;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "getContainerView", "()Landroid/view/View;", "currentItem", "bind", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements kotlinx.android.extensions.LayoutContainer {
        private ru.iu3.reddit.items.ComplexItem currentItem;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View containerView = null;
        private final kotlin.jvm.functions.Function1<ru.iu3.reddit.items.ComplexItem, kotlin.Unit> onItemClick = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        ru.iu3.reddit.items.ComplexItem item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View getContainerView() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View containerView, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super ru.iu3.reddit.items.ComplexItem, kotlin.Unit> onItemClick) {
            super(null);
        }
    }
}