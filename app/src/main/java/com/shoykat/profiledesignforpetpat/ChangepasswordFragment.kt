package com.shoykat.profiledesignforpetpat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.shoykat.profiledesignforpetpat.databinding.FragmentChangepasswordBinding

class ChangepasswordFragment : Fragment() {
    private lateinit var binding : FragmentChangepasswordBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentChangepasswordBinding.inflate(inflater,container,false)
        binding.changepasstoolbar.arrowleft.setOnClickListener {
            findNavController().popBackStack()
        }
        return binding.root
    }

}