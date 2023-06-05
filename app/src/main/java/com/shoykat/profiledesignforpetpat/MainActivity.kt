package com.shoykat.profiledesignforpetpat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.shoykat.profiledesignforpetpat.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
   // private lateinit var binding:ActivityMainBinding
    //private lateinit var navController: NavController



    //private lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       //binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
       //inituI()
        /*val toolbar: androidx.appcompat.widget.Toolbar =findViewById(R.id.maintoolbar)
        setSupportActionBar(toolbar)
        val navHostFragment=supportFragmentManager
            .findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController=navHostFragment.navController
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController,appBarConfiguration)*/


    }

    /*private fun inituI() {
        binding.customtoolbar.filterbar.setOnClickListener {
            Toast.makeText(this, "filterbar is clicked", Toast.LENGTH_SHORT).show()
        }
        binding.customtoolbar.textViewtoolbar.setOnClickListener {
            Toast.makeText(this, "filterbar is clicked", Toast.LENGTH_SHORT).show()

        }
    }*/
    /*override fun onSupportNavigateUp(): Boolean {
        //val navController:NavController=findNavController(R.id.maintoolbar)
        //return navController.navigateUp(appBarConfiguration)||super.onSupportNavigateUp()
        return navController.navigateUp(appBarConfiguration) ||super.onSupportNavigateUp()
    }*/
}