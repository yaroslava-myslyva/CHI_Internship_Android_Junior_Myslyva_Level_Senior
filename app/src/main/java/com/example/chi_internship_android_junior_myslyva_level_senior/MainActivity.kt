package com.example.chi_internship_android_junior_myslyva_level_senior

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.chi_internship_android_junior_myslyva_level_senior.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    companion object{
        val viewModel = ViewModel()
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
    }

    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.activityButton.visibility = View.VISIBLE
        binding.activityButton.setOnClickListener {
           supportFragmentManager.beginTransaction().replace(R.id.main_activity, FirstFragment()).commit()
            it.visibility = View.INVISIBLE
        }

    }
}