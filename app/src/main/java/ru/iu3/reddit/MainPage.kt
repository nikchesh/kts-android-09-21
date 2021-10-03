package ru.iu3.reddit

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import ru.iu3.reddit.Delegates.ComplexDelegatesListAdapter
import ru.iu3.reddit.databinding.FragmentMainPageBinding
import ru.iu3.reddit.items.ComplexItem
import ru.iu3.reddit.items.LoadingItem
import ru.iu3.reddit.items.SimpleItem
import ru.iu3.reddit.utils.PaginationScrollListener
import ru.iu3.reddit.utils.autoCleared
import java.util.*


class MainPage : Fragment(R.layout.fragment_main_page) {

    private val binding by viewBinding(FragmentMainPageBinding::bind)
    private var complexAdapter: ComplexDelegatesListAdapter by autoCleared()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initList()
        loadMoreItems()
    }

    private fun initList() {
        complexAdapter = ComplexDelegatesListAdapter()
        with(binding.list) {
            val orientation = RecyclerView.VERTICAL
            this!!.adapter = complexAdapter
            layoutManager = LinearLayoutManager(context, orientation, false)

            // Pagination
            addOnScrollListener(
                PaginationScrollListener(
                    layoutManager = layoutManager as LinearLayoutManager,
                    requestNextItems = ::loadMoreItems,
                    visibilityThreshold = 0
                )
            )

            addItemDecoration(DividerItemDecoration(context, orientation))
            setHasFixedSize(true)
        }
    }

    private fun getDefaultItems() = List(20) {
        val randomUUID = UUID.randomUUID()
        when ((1..2).random()) {
            1 -> SimpleItem(
                author = "Василий Семенов",
                title = "Срочные новости",
                votes = 5,
                uuid = randomUUID
            )
            2 -> ComplexItem(
                author = "Наталья",
                title = "Статья",
                uuid = randomUUID
            )
            else -> error("Wrong random number")
        }
    }

    private fun loadMoreItems() {
        val newItems = complexAdapter.items.toMutableList().apply {
            if (lastOrNull() is LoadingItem) {
                removeLastOrNull()
            }
        } + getDefaultItems() + LoadingItem()
        complexAdapter.items = newItems

    }

}