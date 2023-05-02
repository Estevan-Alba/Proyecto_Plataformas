package com.view.proyecto_registroycontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val spinner = findViewById<Spinner>(R.id.scrollear)

        val items = arrayOf("Estudiante", "Docente", "Administrativo")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, items)
        spinner.adapter = adapter

        val botonInicio : Button = findViewById(R.id.login)

        botonInicio.setOnClickListener { analizar() }


    }
    private fun analizar() {


        val txtdocumento: EditText = findViewById(R.id.DOCUMENTO)
        val txtnombres : EditText = findViewById(R.id.NOMBRE)
        val txtapellidos : EditText = findViewById(R.id.APELLIDO)
        val txtedad: EditText = findViewById(R.id.EDAD)
        val txtdireccion: EditText = findViewById(R.id.DIRECCION)
        val txttelefono: EditText = findViewById(R.id.TELEFONO)
        val txtusaurio: EditText = findViewById(R.id.USUARIO)
        val txtcontraseña: EditText = findViewById(R.id.CONTRASEÑA)





        var documento: String = txtdocumento.text.toString()
        var nombres: String = txtnombres.text.toString()
        var apellido: String = txtapellidos.text.toString()
        var edad: String = txtedad.text.toString()
        var direccion: String = txtdireccion.text.toString()
        var telefono: String = txttelefono.text.toString()
        var usaurio: String = txtusaurio.text.toString()
        var contraseña: String = txtcontraseña.text.toString()




        println("Sus datos son:\n"
                + "Documento: $documento\n"
                + "Nombres: $nombres\n"
                + "Apellido: $apellido\n"
                + "Edad: $edad\n"
                + "Direccion: $direccion\n"
                + "Telefono: $telefono\n"
                + "Usuario: $usaurio\n"
                + "Contraseña: $contraseña\n")
    }
}