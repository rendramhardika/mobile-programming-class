package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity(), OnSeekBarChangeListener {

    var progressView: TextView? = null
    var seekbarStatusView: TextView? = null
    var seekbarView: SeekBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progress = findViewById<TextView>(R.id.progress)
        val seekbarStatus = findViewById<TextView>(R.id.seekbarStatus)
        val seekbar = findViewById<SeekBar>(R.id.seekBar)

        progressView = progress
        seekbarStatusView = seekbarStatus)

    }
        seekbarView = seekbar
        seekbarView?.setOnSeekBarChangeListener(this

    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        progressView?.text = progress.toString()
        seekbarStatusView?.text  = "Tracking Touch"
    }

    override fun onStartTrackingTouch(seekbar: SeekBar?) {
        seekbarStatusView?.text = "Started Tracking Touch"
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
        seekbarStatusView?.text = "Stopped Tracking Touch"
        //insert data,
    }




}