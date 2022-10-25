package com.example.seccion243

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.seccion243.Database.DB
import com.example.seccion243.Models.Producto
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val producto = Producto("Cocacola", 22)
        val mibase = DB(this,null,null, null)
        mibase.addProducto(producto)

        // Write a message to the database
        val database = Firebase.database
        val myRef = database.getReference("message")
        val titulo = findViewById<TextView>(R.id.main_lblTitulo)
        myRef.setValue("Hello, World!")

        // Read from the database
        myRef.addValueEventListener(object: ValueEventListener {

            override fun onDataChange(snapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = snapshot.getValue()
                titulo.text = value.toString()
                Log.d("Mensaje desde Firebase", "Value is: " + value)
            }

            override fun onCancelled(error: DatabaseError) {
                Log.w("Mensaje desde Firebase", "Failed to read value.", error.toException())
            }

        })

    }
    fun BotonClick(v : View){
        var edad=22

        Log.i("Titulo","Mensaje Info"+edad)
        Log.e("Titulo","Mensaje Error"+edad)
        Log.w("Titulo","Mensaje Warning"+edad)
        Log.d("Titulo","Mensaje debug"+edad)
        Toast.makeText(this,"El mensaje",Toast.LENGTH_LONG).show()
        val cajaUsuario : EditText = findViewById(R.id.main_txtUsuario)
        if(cajaUsuario.text.toString().equals("admin")){
            Log.d("Titulo","entra el usuario"+edad)
            val intento : Intent = Intent(this,MenuActivity::class.java)
            startActivity(intento)
        }
    }
}