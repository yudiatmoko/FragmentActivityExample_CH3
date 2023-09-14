package com.jaws.fragmentactivityexample.presentation.fragmentone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jaws.fragmentactivityexample.R
import com.jaws.fragmentactivityexample.databinding.FragmentOneBinding
import com.jaws.fragmentactivityexample.presentation.model.Person

class FragmentOne : Fragment() {

    private lateinit var binding : FragmentOneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOneBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setClickListener()
    }

    private fun setClickListener() {
        binding.btnNavigate.setOnClickListener{
            navigateToFragmentTwo()
        }
        binding.btnSendDataNavigate.setOnClickListener{
            navigateToFragmentTwo(getPerson())
        }
    }

    private fun getPerson(): Person? {
        return Person(
            name = "Ilham Yudiatmoko",
            job = "The Mechanic",
            profileDesc = "Genius, Billionaire, and Playboy",
            profilePictUrl = "https://images.bisnis.com/posts/2017/06/22/665183/tony-stark.jpg"
        )
    }

    private fun navigateToFragmentTwo(person: Person? = null) {

//        //bundle
//        findNavController().navigate(R.id.action_fragmentOne_to_fragmentTwo, Bundle().apply {
//            putParcelable("person",person)
//        })

        //safeargs
        val action = FragmentOneDirections.actionFragmentOneToFragmentTwo(person)
        findNavController().navigate(action)
    }
}