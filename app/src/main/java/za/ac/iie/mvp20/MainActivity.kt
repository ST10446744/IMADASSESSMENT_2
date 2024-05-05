package za.ac.iie.mvp20

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var feedButton: Button
    private lateinit var playButton: Button
    private lateinit var cleanButton: Button
    private lateinit var clearButton: Button
    private lateinit var petImage: ImageView
    private lateinit var feedIndicator: TextView
    private lateinit var playIndicator: TextView
    private lateinit var cleanIndicator: TextView
    private lateinit var petNameTextView: TextView

    private var feedCount = 0
    private var playCount = 0
    private var cleanCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        nameEditText = findViewById(R.id.nameEditText)
        feedButton = findViewById(R.id.feedButton)
        playButton = findViewById(R.id.playButton)
        cleanButton = findViewById(R.id.cleanButton)
        clearButton = findViewById(R.id.clearButton)
        petImage = findViewById(R.id.petImage)
        feedIndicator = findViewById(R.id.feedIndicator)
        playIndicator = findViewById(R.id.playIndicator)
        cleanIndicator = findViewById(R.id.cleanIndicator)
        petNameTextView = findViewById(R.id.petNameTextView)

        // Set click listeners
        feedButton.setOnClickListener {
            feedCount++
            updateIndicators()
            petImage.setImageResource(R.drawable.pet_feed)
        }

        playButton.setOnClickListener {
            playCount++
            updateIndicators()
            petImage.setImageResource(R.drawable.pet_play)
        }

        cleanButton.setOnClickListener {
            cleanCount++
            updateIndicators()
            petImage.setImageResource(R.drawable.pet_clean)
        }

        clearButton.setOnClickListener {
            clearData()
        }
    }

    private fun updateIndicators() {
        feedIndicator.text = feedCount.toString()
        playIndicator.text = playCount.toString()
        cleanIndicator.text = cleanCount.toString()
    }

    private fun clearData() {
        nameEditText.text.clear()
        feedCount = 0
        playCount = 0
        cleanCount = 0
        updateIndicators()
        petImage.setImageResource(R.drawable.pet_default)
        petNameTextView.text = ""
    }
}
