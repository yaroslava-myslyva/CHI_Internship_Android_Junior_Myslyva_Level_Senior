package com.example.chi_internship_android_junior_myslyva_level_senior

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.chi_internship_android_junior_myslyva_level_senior.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    companion object{
        val viewModel = ViewModel()
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupNavController()
    }

    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupNavController() {
        val navController = binding.navHostFragment.getFragment<NavHostFragment>().navController
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.destination_main_fragment))
        setupActionBarWithNavController(navController, appBarConfiguration)
    }
}