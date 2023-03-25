package co.edu.udea.compumovil.gr06_20231.lab1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class PersonalDataActivity : AppCompatActivity() {
    lateinit var etDate: EditText;

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_data)
        etDate = findViewById<EditText>(R.id.etDate);
        etDate.setOnClickListener{
            showPickerDialog()
        }

        val txt_nombre = findViewById<EditText>(R.id.campoNombre)
        val txt_apellido = findViewById<EditText>(R.id.campoApellido)
        val rd_masculino = findViewById<RadioButton>(R.id.campoMasculino)
        val rd_femenino = findViewById<RadioButton>(R.id.campoFemenino)
        val txt_fechaNacimiento = findViewById<EditText>(R.id.etDate)

        val boton1 = findViewById<Button>(R.id.botonPasarPantalla2)

        boton1.setOnClickListener{
            val enviar = Intent(this, InfoDataActivity::class.java)
            enviar.putExtra("Datos", txt_nombre.text.toString())
            enviar.putExtra("Datos2", txt_apellido.text.toString())
            enviar.putExtra("Datos3", rd_masculino.text.toString())
            enviar.putExtra("Datos4", rd_femenino.text.toString())
            enviar.putExtra("Datos5", txt_fechaNacimiento.text.toString())
            startActivity(enviar)

            val lanzar = Intent(this, ContactDataActivity::class.java)
            startActivity(lanzar)
        }
        /*Log.d(TAG, "onCreate")
        val myButton = findViewById<Button>(R.id.botonPasarPantalla2)
        myButton.setOnClickListener {
            val i = Intent(this, PersonalDataActivity::class.java)
            var a ="My Value"
            var gson = Gson()
            var jsonString = gson.toJson(TestModel(1,"Test"))
            i.putExtra("mykey",jsonString)

            startActivity(i)
        }*/
    }

    private fun showPickerDialog() {
        val datePicker = DatePickerFragment { day, month, year -> onDateSelected(day, month, year) }
        datePicker.show(supportFragmentManager, "datePicker")
    }
    private fun onDateSelected(day: Int, month: Int, year: Int) {
        etDate.setText("$day/$month/$year")
    }



}




