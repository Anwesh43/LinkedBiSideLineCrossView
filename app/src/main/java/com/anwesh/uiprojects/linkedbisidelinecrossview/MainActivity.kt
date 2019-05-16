package com.anwesh.uiprojects.linkedbisidelinecrossview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.bisidelinecrossview.BiSideLineCrossView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BiSideLineCrossView.create(this)
    }
}
