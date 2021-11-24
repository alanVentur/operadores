package io.github.operacionesbasicas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // INSTANCIAR ELEMENTOS //
        val txtnumero1 = findViewById<EditText>(R.id.Numero1)
        val txtnumero2 = findViewById<EditText>(R.id.Numero2)
        val botonSumar = findViewById<Button>(R.id.btnSumar)
        val botonrestar = findViewById<Button>(R.id.btnRestar)
        val botonmultiplicar = findViewById<Button>(R.id.btnMultiplicar)
        val botondividir = findViewById<Button>(R.id.btnDividir)
        val botonresultado = findViewById<TextView>(R.id.resultado)
        val botonReiniciar = findViewById<Button>(R.id.btnReiniciar)


        var resultado: Long? = null
        botonSumar.setOnClickListener {
            if (txtnumero1.text.isNotEmpty() && txtnumero2.text.isNotEmpty()) {
                resultado = txtnumero1.text.toString().toLong() + txtnumero2.text.toString().toLong()
                botonresultado.text = resultado.toString()
            }
            else{
                Toast.makeText( this,"los dos campos son obligatorios", Toast.LENGTH_SHORT).show()
            }
        }
        botonrestar.setOnClickListener {
            if (txtnumero1.text.isNotEmpty() && txtnumero2.text.isNotEmpty()) {
                resultado = txtnumero1.text.toString().toLong() - txtnumero2.text.toString().toLong()
                botonresultado.text = resultado.toString()
            }
            else{
                Toast.makeText( this,"los dos campos son obligatorios", Toast.LENGTH_SHORT).show()
            }
        }
        botonmultiplicar.setOnClickListener {
            if (txtnumero1.text.isNotEmpty() && txtnumero2.text.isNotEmpty()) {
                resultado = txtnumero1.text.toString().toLong() * txtnumero2.text.toString().toLong()
                botonresultado.text = resultado.toString()
            }
            else{
                Toast.makeText( this,"los dos campos son obligatorios", Toast.LENGTH_SHORT).show()
            }
        }
        botondividir.setOnClickListener {
            if (txtnumero1.text.isNotEmpty() && txtnumero2.text.isNotEmpty()) {
                resultado = txtnumero1.text.toString().toLong() / txtnumero2.text.toString().toLong()
                botonresultado.text = resultado.toString()
            }
            else{
                Toast.makeText( this,"los dos campos son obligatorios", Toast.LENGTH_SHORT).show()
            }
        }
       botonReiniciar.setOnClickListener {
           txtnumero1.text.clear()
           txtnumero2.text.clear()
           botonresultado.text = ""
       }
    }
}