package com.zinc.jitpackpublishdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zinc.zinc_module_a.ZincModuleA
import com.zinc.zinc_module_b.ZincModuleB

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ZincModuleA().a()
        ZincModuleB().b()
    }
}