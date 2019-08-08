package com.rafaykalim.faceauthdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.rafaykalim.faceauth.RegisterFaceView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var v = RegisterFaceView(this)
        setContentView(v)
    }
}