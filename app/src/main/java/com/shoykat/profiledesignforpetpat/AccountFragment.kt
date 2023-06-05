package com.shoykat.profiledesignforpetpat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.shoykat.profiledesignforpetpat.databinding.FragmentAccountBinding


class AccountFragment : Fragment() {
    private lateinit var binding : FragmentAccountBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding= FragmentAccountBinding.inflate(inflater,container,false)
        binding.myProfile.setOnClickListener {
            findNavController().navigate(R.id.profile_CarFragment)
        }
        binding.OrdersHistory.setOnClickListener {
            findNavController().navigate(R.id.orderHistoryFragment)
        }
        binding.changeLanguage.setOnClickListener {
            findNavController().navigate(R.id.change_Laguage)
        }
        binding.reportAnIssue.setOnClickListener {
            findNavController().navigate(R.id.reportFragment)
        }
        binding.myChangePass.setOnClickListener {
            findNavController().navigate(R.id.changepasswordFragment)
        }
        binding.logOut.setOnClickListener {
            Toast.makeText(requireActivity(), "this is logout clicked ", Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }

}