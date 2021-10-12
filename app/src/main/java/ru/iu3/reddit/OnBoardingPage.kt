package ru.iu3.reddit

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_salution.*


class OnBoardingPage : Fragment(R.layout.fragment_salution) {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewPager2.adapter = ViewPagerAdapter()
        val startButton = view?.findViewById<Button>(R.id.buttonStart)

        startButton?.setOnClickListener {
            findNavController().navigate(R.id.action_salutionFragment_to_loginFragment3)
        }

    }

}



