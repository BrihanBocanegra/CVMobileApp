package com.example.cvmobileapp

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView


class MainActivity : AppCompatActivity() {
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        // Orientación de la pantalla: Vertical
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1 = findViewById<Button>(R.id.button)
        boton1.setOnClickListener {
            val intento1 = Intent(this, Background::class.java)
            startActivity(intento1)
        }

        var experience_card = findViewById<CardView>(R.id.experience_card)
        var background_card = findViewById<CardView>(R.id.background_card)
        var interest_card = findViewById<CardView>(R.id.interest_card)
        var portfolio_card = findViewById<CardView>(R.id.portfolio_card)

        experience_card.setOnClickListener {
            startActivity(Intent(this,Experience::class.java))
        }

        background_card.setOnClickListener {
            startActivity(Intent(this,Background::class.java))
        }

        interest_card.setOnClickListener {
            startActivity(Intent(this,Interest::class.java))
        }

        portfolio_card.setOnClickListener {
            startActivity(Intent(this,Portfolio::class.java))
        }

    }

}