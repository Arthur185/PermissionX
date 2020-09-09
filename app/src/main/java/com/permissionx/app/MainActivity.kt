package com.permissionx.app

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.permissionx.wangfeidev.PermissionX
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text.setOnClickListener {
            getPermission()
        }

    }

    private fun getPermission() {
        PermissionX.request(this, Manifest.permission.CALL_PHONE) { allGranted, deniedList ->
            if (allGranted) {
                Toast.makeText(this, "yes", Toast.LENGTH_SHORT).show()
            } else {
//                getPermission()
                Toast.makeText(this, "请开启权限", Toast.LENGTH_SHORT).show()
            }
        }
    }
}