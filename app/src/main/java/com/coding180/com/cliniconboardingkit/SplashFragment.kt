package com.coding180.com.cliniconboardingkit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.Navigation
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class SplshFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_splash, container, false)

        lifecycleScope.launch {
            // delay 3secs before navigation
            delay(3000)
            Navigation.findNavController(requireView())
                .navigate(R.id.action_splshFragment_to_slideOneFragment)
        }
        return view

    }

}