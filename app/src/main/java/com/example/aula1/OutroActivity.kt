package com.example.aula1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_outro.*

class OutroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outro)

        textView_2.setOnClickListener {
            var intt = Intent(this, MainActivity::class.java)
            startActivity(intt)
        }
    }
}
