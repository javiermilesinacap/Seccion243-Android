package com.example.seccion243

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
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
        val cajaUsuario : EditText = findViewById(R.id.main_txtUsuario)
        if(cajaUsuario.text.equals("admin")){
            Log.d("Titulo","entra el usuario"+edad)
            val intento : Intent = Intent(this,MenuActivity::class.java)
            startActivity(intento)
        }
    }
}