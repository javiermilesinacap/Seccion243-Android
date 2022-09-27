package com.example.seccion243

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun BotonClick(v : View){
        var edad=22
        Log.i("Titulo","Mensaje Info"+edad)
        Log.e("Titulo","Mensaje Error"+edad)
        Log.w("Titulo","Mensaje Warning"+edad)
        Log.d("Titulo","Mensaje debug"+edad)
        Toast.makeText(this,"El mensaje",Toast.LENGTH_LONG).show()
    }
}