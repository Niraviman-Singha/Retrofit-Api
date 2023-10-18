package com.example.retrofitapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quatesApi = RetrofitBuilder.getInstance().create(MyInterface::class.java)

        GlobalScope.launch {
            val result = quatesApi.getQuotes()

            if (result!=null){
               Log.d("niraviman",result.body().toString())
            }
        }
    }
}