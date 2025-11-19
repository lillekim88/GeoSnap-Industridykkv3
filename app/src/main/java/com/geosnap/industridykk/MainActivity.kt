package com.geosnap.industridykk

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Show version toast on startup
        Toast.makeText(this, "GeoSnap v0.1.7-PROOF", Toast.LENGTH_LONG).show()
        
        setContentView(R.layout.activity_main)
    }
}
