package com.example.mentalhealthapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.mentalhealthapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var button2: Button
    private lateinit var btnSendMsgToNextActivity: Button
    private lateinit var etUserMessage: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.title = "PILLAR"

        button2 = binding.button2

        button2.setOnClickListener {

            Log.i("MainActivity", "Button was clicked !")
            Toast.makeText(this, "Button was clicked !", Toast.LENGTH_SHORT).show()
        }

        btnSendMsgToNextActivity = binding.btnSendMsgToNextActivity

        etUserMessage = binding.etUserMessage

        btnSendMsgToNextActivity.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

        }

    }
}