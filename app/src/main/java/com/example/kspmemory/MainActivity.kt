package com.example.kspmemory

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.mylibrary.MyLocalDatasource
import com.example.mylibrary.MyLocalDatasource1
import com.example.mylibrary.MyLocalDatasource2
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycleScope.launch {
            MyLocalDatasource(applicationContext).initDatabase()
        }
        lifecycleScope.launch {
            MyLocalDatasource1(applicationContext).initDatabase()
        }
        lifecycleScope.launch {
            MyLocalDatasource2(applicationContext).initDatabase()
        }
    }
}
