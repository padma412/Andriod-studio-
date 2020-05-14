package com.example.newproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("On Create")
    }
    fun sendMessage(view: View) {
        // Do something in response to button
        val editText = findViewById<EditText>(R.id.editText10)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
   override fun onStart() {
        super.onStart()
       println("On Start")
    }

    override fun onResume() {
        super.onResume()
        println("On Resume")
    }

    override fun onPause() {
        super.onPause()
        println("On Pause")
    }

    override fun onStop() {
        super.onStop()
        println("On Stop")
    }

    override fun onRestart() {
        super.onRestart()
        println("On Restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("On Destroy")
    }
}







