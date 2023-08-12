package com.example.projectnew

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var pol: Button
    private lateinit var ca: Button
    private lateinit var anc: Button
    private lateinit var med: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        pol = findViewById(R.id.pol)
        ca = findViewById(R.id.ca)
        anc = findViewById(R.id.anc)
        med = findViewById(R.id.med)

        anc.setOnClickListener {
            val intent = Intent(this@MainActivity, Login::class.java)
            startActivity(intent)
        }

        pol.setOnClickListener {
            val intent = Intent(this@MainActivity, polity::class.java)
            startActivity(intent)
        }
    }
}
