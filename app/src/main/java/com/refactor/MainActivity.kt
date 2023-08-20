package com.refactor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var questionTextView: TextView
    private lateinit var randomButton: Button
    private val questions = mutableListOf<String>()
    private val random = Random

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        questionTextView = findViewById(R.id.question_text)
        randomButton = findViewById(R.id.random_button)

        // Initialize the list of questions
        questions.add("Ceritain pengalaman memalukan waktu SMA")
        questions.add("Tell us your last 3 youtube history")
        questions.add("Mending cari pasangan baru atau balikan sama mantan????")
        questions.add("Darkest secret yang pernah kamu tau/diceritain ke kamu (gaperlu mention orangnya!)")
        questions.add("Hal yang kamu ga suka dari orangtua kamu")
        questions.add("Cerita di-friendzone-in?")
        questions.add("Recent played spotify?")
        questions.add("Kalau bisa time travel tapi hanya jadi observer, mau ke masa depan atau masa lalu?(Mention apa yang mau dilihat)")
        questions.add("Ceritain pengalaman buruk di pkkmb")

        randomButton.setOnClickListener {
            showRandomQuestion()
        }
    }

    private fun showRandomQuestion() {
        val randomIndex = random.nextInt(questions.size)
        val randomQuestion = questions[randomIndex]
        questionTextView.text = randomQuestion
    }
}