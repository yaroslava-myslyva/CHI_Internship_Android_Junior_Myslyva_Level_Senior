package com.example.chi_internship_android_junior_myslyva_level_senior


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.navigation.fragment.findNavController
import com.example.chi_internship_android_junior_myslyva_level_senior.MainActivity.Companion.viewModel
import com.example.chi_internship_android_junior_myslyva_level_senior.databinding.FragmentCounterBinding

class CounterFragment : Fragment() {

    private lateinit var binding: FragmentCounterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCounterBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar()
        viewModel.counter.observe(viewLifecycleOwner) {
            binding.fragmentTextview.text = it.toString()
        }
        binding.fragmentButton.setOnClickListener {
            viewModel.increaseCounter()
        }
    }

    private fun setupToolbar() {
        val menuHost: MenuHost = requireActivity()
        menuHost.addMenuProvider(object : MenuProvider {
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {}

            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                if (menuItem.itemId == android.R.id.home) {
                    findNavController().navigate(R.id.destination_main_fragment)
                }
                return false
            }
        })
    }
}
