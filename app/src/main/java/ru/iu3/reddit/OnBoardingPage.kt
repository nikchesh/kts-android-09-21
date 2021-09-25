package ru.iu3.reddit

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import timber.log.Timber

class OnBoardingPage: Fragment(R.layout.fragment_salution) {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        val startButton = view?.findViewById<Button>(R.id.buttonStart)

        startButton?.setOnClickListener {
            findNavController().navigate(R.id.action_salutionFragment_to_loginFragment3)
        }
        Timber.e("onActivityCreated ${hashCode()}")

        }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Timber.e("onAttach ${hashCode()}")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.e("onCreate ${hashCode()}")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
        Timber.e("onCreateView ${hashCode()}")
    }

    override fun onStart() {
        super.onStart()
        Timber.e("onStart ${hashCode()}")
    }


    override fun onResume() {
        super.onResume()
        Timber.e("onResume ${hashCode()}")
    }


    override fun onPause() {
        super.onPause()
        Timber.e("onPause ${hashCode()}")
    }

    override fun onStop() {
        super.onStop()
        Timber.e("onStop ${hashCode()}")
    }


    override fun onDestroyView() {
        super.onDestroyView()
        Timber.e("onDestroyView ${hashCode()}")

    }


    override fun onDestroy() {
        super.onDestroy()
        Timber.e("onDestroy ${hashCode()}")
    }

    override fun onDetach() {
        super.onDetach()
        Timber.e("onDetach ${hashCode()}")
    }
    }



