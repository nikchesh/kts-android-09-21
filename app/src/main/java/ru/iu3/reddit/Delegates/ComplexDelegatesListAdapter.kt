package ru.iu3.reddit.Delegates

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil
import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter
import ru.iu3.reddit.items.ComplexItem
import ru.iu3.reddit.items.SimpleItem

class ComplexDelegatesListAdapter : AsyncListDifferDelegationAdapter<Any>(ComplexDiffCallback()) {

    init {
        delegatesManager
            .addDelegate(SimpleItemDelegate())
            .addDelegate(ComplexItemDelegate())
            .addDelegate(PageLoadingAdapterDelegate())
    }

    class ComplexDiffCallback : DiffUtil.ItemCallback<Any>() {
        override fun areItemsTheSame(first: Any, second: Any): Boolean {
            return first.javaClass == second.javaClass && when (first) {
                is SimpleItem -> first.uuid == (second as SimpleItem).uuid
                is ComplexItem -> first.uuid == (second as ComplexItem).uuid
                else -> true
            }
        }

        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(first: Any, second: Any): Boolean = first == second
    }

}