package com.shoykat.profiledesignforpetpat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.shoykat.profiledesignforpetpat.databinding.FragmentReportBinding

class ReportFragment : Fragment() {
    private lateinit var binding : FragmentReportBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentReportBinding.inflate(inflater,container,false)
        binding.reportpasstoolbar.arrowleft.setOnClickListener {
            findNavController().popBackStack()
        }
        return binding.root
    }
}