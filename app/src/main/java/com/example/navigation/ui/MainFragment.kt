package com.example.navigation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigation.R
import com.example.navigation.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(binding.root)
        binding.tvProfile.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("name","Sateesh")
            navController.navigate(R.id.action_nav_main_to_profileFragment2,bundle)
        }

        binding.tvSettings.setOnClickListener {
            navController.navigate(R.id.action_nav_main_to_settingsFragment)
        }
    }

}