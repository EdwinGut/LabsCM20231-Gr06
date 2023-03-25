package co.edu.udea.compumovil.gr06_20231.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class InfoDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_data)

        val bundle = intent.extras
        val dato = bundle?.getString("Datos")
        val dato2 = bundle?.getString("Datos2")
        val dato3 = bundle?.getString("Datos3")
        val dato4 = bundle?.getString("Datos4")
        val dato5 = bundle?.getString("Datos5")
        val dato6 = bundle?.getString("Datos6")
        val dato7 = bundle?.getString("Datos7")
        val dato8 = bundle?.getString("Datos8")
        val dato9 = bundle?.getString("Datos9")

        val envio = findViewById<TextView>(R.id.txt_enviado)
        envio.text = "Los datos ingresados son: " + '\n' + "Nombres: " + dato.toString() +
                '\n' + "Apellidos: " + dato2.toString() + '\n' + "Género: " + dato3.toString() + '\n' + dato4.toString() +
        '\n' + "Fecha de nacimiento: " + dato5.toString() + '\n' + "Telefono: " + dato6.toString() + '\n' + "Correo: " + dato7.toString() +
                '\n' + "Pais: " + dato8.toString() + '\n' + "Direccion: " + dato9.toString()

        val boton2 = findViewById<Button>(R.id.btnAtras)
        boton2.setOnClickListener{
            val lanzar = Intent(this, PersonalDataActivity::class.java)
            startActivity(lanzar)
        }

        /*val bundle = intent.extras;
        val dato = bundle?.getString("mykey")
        val gson = Gson()
        if (dato != null) {
            var testModel = gson.fromJson(dato, TestModel::class.java)
            Log.d(TAG,dato)
            Log.d(TAG, testModel.toString())
        }*/
    }
}