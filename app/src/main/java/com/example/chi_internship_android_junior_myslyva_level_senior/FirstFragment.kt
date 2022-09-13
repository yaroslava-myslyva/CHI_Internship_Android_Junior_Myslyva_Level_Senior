package com.example.chi_internship_android_junior_myslyva_level_senior


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.chi_internship_android_junior_myslyva_level_senior.MainActivity.Companion.viewModel
import com.example.chi_internship_android_junior_myslyva_level_senior.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.counter.observe(viewLifecycleOwner) {
            binding.fragmentTextview.text = it.toString()
        }
        binding.fragmentButton.setOnClickListener {
            viewModel.increaseCounter()
        }
    }
}
