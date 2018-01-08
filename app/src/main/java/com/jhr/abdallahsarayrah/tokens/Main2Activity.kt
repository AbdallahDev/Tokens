package com.jhr.abdallahsarayrah.tokens

import android.annotation.SuppressLint
import android.content.Context
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class Main2Activity : AppCompatActivity() {
    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
////
        val manager = getSystemService(Context.LOCATION_SERVICE) as LocationManager

        val s = object : LocationListener {
            override fun onLocationChanged(p0: Location) {
                Toast.makeText(this@Main2Activity,
                        p0.latitude.toString() + " " + p0.longitude,
                        Toast.LENGTH_SHORT).show()
            }

            override fun onStatusChanged(p0: String?, p1: Int, p2: Bundle?) {
            }

            override fun onProviderEnabled(p0: String?) {
            }

            override fun onProviderDisabled(p0: String?) {

            }
        }

        manager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0.0F, s)
    }
}
