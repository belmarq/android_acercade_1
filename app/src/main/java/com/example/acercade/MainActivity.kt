package com.example.acercade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.acercade.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val myNombre: MyNombre = MyNombre(nombre = "José Márquez")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.miNombre = myNombre
        binding.buttonApodo.setOnClickListener{
            agregarApodo(it)
        }
    }

    private fun agregarApodo(view: View) {
        binding.apply {
            myNombre.apodo = editTextApodo.text.toString()
            //textViewApodo.text = editTextApodo.text
            invalidateAll()
            editTextApodo.visibility = View.GONE
            view.visibility = View.GONE
            textViewApodo.visibility = View.VISIBLE
        }
    }
}