package com.example.aula1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    text_view_1.setOnClickListener{
        var intt = Intent(this, OutroActivity::class.java)
        startActivity(intt)
    }

    Toast.makeText(
        this,
        "On Create",
        Toast.LENGTH_LONG
    ).show()

    }
    override fun onStart() {
        super.onStart()

        Toast.makeText(
            this,
            "On Start",
            Toast.LENGTH_LONG
        ).show()


    }
    override fun onResume() {
        super.onResume()

        Toast.makeText(
            this,
            "On Resume",
            Toast.LENGTH_LONG
        ).show()
    }
    override fun onPause(){
        super.onPause()
        Toast.makeText(
            this,
            "On Pause",
            Toast.LENGTH_LONG
        ).show()

    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(
            this,
            "On Stop",
            Toast.LENGTH_LONG
        ).show()

    }
}
