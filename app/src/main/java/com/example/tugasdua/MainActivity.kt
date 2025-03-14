package com.example.tugasdua

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// Sesuaikan dengan package name proyek kamu
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Menampilkan teks nama dan kelas
        val textView = findViewById<TextView>(R.id.textViewNama)
        textView.text = "Andre Johann Jonnius - 4B."
    }
}