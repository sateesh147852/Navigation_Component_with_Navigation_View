package com.example.navigation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavAction
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigation.R
import com.example.navigation.databinding.FragmentChatBinding


class ChatFragment : Fragment() {

    private lateinit var binding : FragmentChatBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChatBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        binding.tvSettings.setOnClickListener {
            navController.navigate(R.id.action_chatFragment_to_settingsFragment)
        }
    }

}