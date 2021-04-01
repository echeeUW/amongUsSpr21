package edu.uw.echee.amongus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val randomNumber = Random.nextInt(1000, 10000)
    private lateinit var tvGameCode: TextView
    private lateinit var etUserEnteredGameCode: EditText
    private lateinit var btnJoin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvGameCode = findViewById(R.id.tvGameCode)
        etUserEnteredGameCode = findViewById(R.id.etUserEnteredGameCode)
        btnJoin = findViewById(R.id.btnJoin)

        tvGameCode.text = randomNumber.toString()

        btnJoin.setOnClickListener {
            joinClicked()
        }
    }

    fun joinClicked() {
        // Get text that user entered
        val userInputtedText = etUserEnteredGameCode.text.toString()

        // Compare the
        if (userInputtedText == tvGameCode.text) {
            Toast.makeText(this, "Hooray You're In!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Thats kinda sussss.....", Toast.LENGTH_SHORT).show()
        }
    }
}
