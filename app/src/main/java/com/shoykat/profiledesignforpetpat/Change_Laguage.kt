package com.shoykat.profiledesignforpetpat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.shoykat.profiledesignforpetpat.databinding.FragmentChangeLaguageBinding

class Change_Laguage : Fragment() {
    private lateinit var binding :FragmentChangeLaguageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentChangeLaguageBinding.inflate(inflater,container,false)
        binding.changelanguagetoolbar.arrowleft.setOnClickListener {
            findNavController().popBackStack()
        }
        return binding.root
    }

}