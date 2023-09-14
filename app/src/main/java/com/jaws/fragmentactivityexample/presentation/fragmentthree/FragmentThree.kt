package com.jaws.fragmentactivityexample.presentation.fragmentthree

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jaws.fragmentactivityexample.R
import com.jaws.fragmentactivityexample.databinding.FragmentThreeBinding

class FragmentThree : Fragment() {
    private lateinit var binding : FragmentThreeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThreeBinding.inflate(inflater,container,false)
        return binding.root
    }
}