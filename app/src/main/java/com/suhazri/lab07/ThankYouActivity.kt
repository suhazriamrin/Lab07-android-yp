package com.suhazri.lab07

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.suhazri.lab07.databinding.ActivityThankYouBinding

class ThankYouActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThankYouBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityThankYouBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
}