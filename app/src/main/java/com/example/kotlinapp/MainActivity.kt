package com.example.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hellotext.text="hey"

    }
    fun Spinn(v:View){
        rollDice()
        Toast.makeText(this,"Done!!!",Toast.LENGTH_LONG).show();

    }

    private fun rollDice() {
        val result: TextView =findViewById(R.id.hellotext)
        result.text="Roll one"
    }

}
