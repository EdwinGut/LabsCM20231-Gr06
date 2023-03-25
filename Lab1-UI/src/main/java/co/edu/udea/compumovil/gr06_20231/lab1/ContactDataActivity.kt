package co.edu.udea.compumovil.gr06_20231.lab1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class ContactDataActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_data)

        val tel = findViewById<EditText>(R.id.campoTelefono)
        val correo = findViewById<EditText>(R.id.campoCorreo)
        val pais = findViewById<AutoCompleteTextView>(R.id.campoPais)
        val direccion = findViewById<EditText>(R.id.campoDireccion)


        val botonSiguiente2 = findViewById<Button>(R.id.botonSiguiente2)

        botonSiguiente2.setOnClickListener{
            val enviar = Intent(this, InfoDataActivity::class.java)
            enviar.putExtra("Datos6", tel.text.toString())
            enviar.putExtra("Datos7", correo.text.toString())
            enviar.putExtra("Datos8", pais.text.toString())
            enviar.putExtra("Datos9", direccion.text.toString())

            startActivity(enviar)
        }
    }
}