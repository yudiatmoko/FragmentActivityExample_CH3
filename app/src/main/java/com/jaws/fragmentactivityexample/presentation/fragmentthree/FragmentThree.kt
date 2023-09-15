package com.jaws.fragmentactivityexample.presentation.fragmentthree

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jaws.fragmentactivityexample.R
import com.jaws.fragmentactivityexample.databinding.FragmentThreeBinding
import com.jaws.fragmentactivityexample.presentation.model.Person
import com.jaws.fragmentactivityexample.presentation.otheractivity.OtherActivity

class FragmentThree : Fragment() {
    private lateinit var binding : FragmentThreeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThreeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setClickListener()
    }

    private fun setClickListener() {
        binding.btnNavigateOther.setOnClickListener{
            navigateToOtherActivity()
        }
    }

    private fun navigateToOtherActivity() {
        OtherActivity.startActivity(requireContext(),"Ilham",20, Person("Jawa", "FSAD","FASF","FSAFDSA"))
    }
}