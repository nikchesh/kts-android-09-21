package ru.iu3.reddit

import android.content.Context
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_salution_page.view.*
import androidx.navigation.fragment.findNavController


class ViewPagerAdapter : RecyclerView.Adapter<PagerVH>() {

    private val colors = intArrayOf(
        R.color.grey_text,
        R.color.white,
        R.color.grey_text,
        R.color.white
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH =
        PagerVH(
            LayoutInflater.from(parent.context).inflate(R.layout.item_salution_page, parent, false)
        )

    override fun getItemCount(): Int = colors.size


    override fun onBindViewHolder(holder: PagerVH, position: Int) = holder.itemView.run {
        val startButton = findViewById<Button>(R.id.buttonStart)

        startButton?.setOnClickListener {
            findNavController().navigate(R.id.action_salutionFragment_to_loginFragment3)
        }
        val salutionStringArray =
            context.resources.getStringArray(R.array.fragment_salution_salutionTexts)
        if (position != 3)
            startButton.setEnabled(false)
        else
            startButton.setEnabled(true)
        tvTitle.text = salutionStringArray[position]
        container.setBackgroundResource(colors[position])
    }
}

class PagerVH(itemView: View) : RecyclerView.ViewHolder(itemView)