package com.shoykat.profiledesignforpetpat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.shoykat.profiledesignforpetpat.Adapter.orderRowAdapter
import com.shoykat.profiledesignforpetpat.databinding.FragmentOrderHistoryBinding


class OrderHistoryFragment : Fragment() {
    private lateinit var binding: FragmentOrderHistoryBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentOrderHistoryBinding.inflate(inflater,container,false)
        binding.orderhistorytoolbar.filterbar.setOnClickListener {
            findNavController().popBackStack()
        }


        return binding.root
    }


}