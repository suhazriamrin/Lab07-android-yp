package com.suhazri.lab07

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.suhazri.lab07.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.scheduleButton.setOnClickListener {
            val name = binding.nameEditText.text.toString()
            val address = binding.addressEditText.text.toString()
            val city = binding.cityEditText.text.toString()
            val state = binding.stateEditText.text.toString()
            val zipcode = binding.zipcodeEditText.text.toString()
            val country = binding.countryEditText.text.toString()

            var isValid = true

            // Validate Name (Only characters)
            if (name.isEmpty()) {
                binding.nameEditText.error = "Please fill in the details"
                isValid = false
            }

            // Validate Address (Cannot be empty)
            if (address.isEmpty()) {
                binding.addressEditText.error = "Please fill in the details"
                isValid = false
            }

            // Validate City (Only characters)
            if (city.isEmpty()) {
                binding.cityEditText.error = "Please fill in the details"
                isValid = false
            }

            // Validate State (Only characters)
            if (state.isEmpty()) {
                binding.stateEditText.error = "Please fill in the details"
                isValid = false
            }

            // Validate Zipcode (Only numbers)
            if (zipcode.isEmpty()) {
                binding.zipcodeEditText.error = "Please fill in the details"
                isValid = false
            }

            // Validate Country (Only characters)
            if (country.isEmpty()) {
                binding.countryEditText.error = "Please fill in the details"
                isValid = false
            }

            if (isValid) {
                val intent = Intent(this, DetailActivity::class.java)

                intent.putExtra("name", name)
                intent.putExtra("address", address)
                intent.putExtra("city", city)
                intent.putExtra("state", state)
                intent.putExtra("zipcode", zipcode)
                intent.putExtra("country", country)

                startActivity(intent)
            }

        }
    }


}