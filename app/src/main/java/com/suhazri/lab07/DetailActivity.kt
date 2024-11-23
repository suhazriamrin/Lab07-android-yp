package com.suhazri.lab07

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.suhazri.lab07.databinding.ActivityDetailBinding
import com.suhazri.lab07.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.nameTextView.text = ": " + intent.getStringExtra("name")
        binding.addressTextView.text = ": " + intent.getStringExtra("address")
        binding.cityTextView.text = ": " + intent.getStringExtra("city")
        binding.stateTextView.text = ": " + intent.getStringExtra("state")
        binding.zipcodeTextView.text = ": " + intent.getStringExtra("zipcode")
        binding.countryTextView.text = ": " + intent.getStringExtra("country")

        binding.cancelButton.setOnClickListener {
            finish()
        }

        binding.confirmButton.setOnClickListener {
            intent = Intent(this, ThankYouActivity::class.java)
            startActivity(intent)
        }
    }
}