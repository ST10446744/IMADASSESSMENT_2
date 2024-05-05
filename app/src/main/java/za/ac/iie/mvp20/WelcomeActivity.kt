package za.ac.iie.mvp20

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    private lateinit var startButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // Initialize views
        startButton = findViewById(R.id.startButton)

        // Set click listener for the start button
        startButton.setOnClickListener {
            // Start za.ac.iie.mvp20.MainActivity when the button is clicked
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Finish this activity so that it cannot be navigated back to
        }
    }
}

