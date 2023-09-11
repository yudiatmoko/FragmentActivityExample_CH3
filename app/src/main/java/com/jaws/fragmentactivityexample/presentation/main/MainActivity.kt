package com.jaws.fragmentactivityexample.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.jaws.fragmentactivityexample.R
import com.jaws.fragmentactivityexample.databinding.ActivityMain2Binding
import com.jaws.fragmentactivityexample.presentation.fragmentone.FragmentOne
import com.jaws.fragmentactivityexample.presentation.fragmentthree.FragmentThree
import com.jaws.fragmentactivityexample.presentation.fragmenttwo.FragmentTwo

class MainActivity : AppCompatActivity() {

    private val fragmentOne: FragmentOne by lazy { FragmentOne() }
    private val fragmentTwo: FragmentTwo by lazy { FragmentTwo() }
    private val fragmentThree: FragmentThree by lazy { FragmentThree() }

    private val binding: ActivityMain2Binding by lazy {
        ActivityMain2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setClickButtonNavigate()
        replaceFragment(fragmentOne)
    }

    private fun setClickButtonNavigate() {
        binding.btnFragment1.setOnClickListener {
            replaceFragment(fragmentOne)
        }
        binding.btnFragment2.setOnClickListener {
            replaceFragment(fragmentTwo)
        }
        binding.btnFragment3.setOnClickListener {
            replaceFragment(fragmentThree)
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(binding.flContainer.id, fragment)
            .commit()
    }
}