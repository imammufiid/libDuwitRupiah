package com.mufiid.myfirstlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.mufiid.mylibrary.DuwitRupiah

class MainActivity : AppCompatActivity() {
    private var duwitRupiah: DuwitRupiah? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        duwitRupiah = DuwitRupiah()
        val result = duwitRupiah?.generate("2500000")

        Toast.makeText(this, result, Toast.LENGTH_SHORT).show()
    }
}