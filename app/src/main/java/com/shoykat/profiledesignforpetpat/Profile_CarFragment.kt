package com.shoykat.profiledesignforpetpat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.shoykat.profiledesignforpetpat.databinding.FragmentProfileCarBinding


class Profile_CarFragment : Fragment() {
    private lateinit var binding :FragmentProfileCarBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentProfileCarBinding.inflate(inflater,container,false)
        inituI()
        return binding.root
    }

    private fun inituI() {
        binding.profilecustomtoolbar.arrowleft.setOnClickListener {
            findNavController().popBackStack()
        }

    }


}