package com.isoftinc.kotlinpractics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup



/**
 * A simple [Fragment] subclass.
 * Use the [GaurdFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GaurdFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gaurd, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() = GaurdFragment()
    }
}