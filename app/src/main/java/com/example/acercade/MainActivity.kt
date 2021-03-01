package com.example.acercade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_apodo).setOnClickListener{
            agregarApodo(it)
        }
    }

    private fun agregarApodo(view: View) {
        val editText = findViewById<EditText>(R.id.editTextApodo)
        val apodoTextView = findViewById<TextView>(R.id.textViewApodo)
        apodoTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        apodoTextView.visibility = View.VISIBLE
    }
}