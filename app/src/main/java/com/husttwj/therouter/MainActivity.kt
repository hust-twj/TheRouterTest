package com.husttwj.therouter

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.husttwj.common.getAppProvider

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.test).setOnClickListener {
            Log.e("twj124", "MainActivity: " + getAppProvider())
        }
    }

}
