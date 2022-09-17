package com.example.chi_internship_android_junior_myslyva_level_senior

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.chi_internship_android_junior_myslyva_level_senior.MainActivity.Companion.viewModel
import com.example.chi_internship_android_junior_myslyva_level_senior.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        viewModel.counter.observe(viewLifecycleOwner) {
            binding.fragmentMainTextview.text = it.toString()

        }
        binding.fragmentMainButton.setOnClickListener {
            findNavController().navigate(R.id.destination_counter_fragment)
        }
    }
}