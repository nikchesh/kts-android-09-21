package ru.iu3.reddit.items

import java.util.*

data class SimpleItem(
    val author: String,
    val title: String,
    var votes: Int,
    val uuid: UUID
)