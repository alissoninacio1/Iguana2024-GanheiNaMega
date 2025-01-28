package co.tiagoaguiar.ganheinamega

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //where you decided what the app will do
        setContentView(R.layout.activity_main)

        //search for the objects and get their reference
        val editText: EditText  = findViewById(R.id.edit_number)
        val txtResult: TextView = findViewById(R.id.txt_result)
        val btnGenerate: Button = findViewById(R.id.btn_generate)

        btnGenerate.setOnClickListener {
            val text  = editText.text.toString()
            numberGenerator(text, txtResult)
        }

    }

    private fun numberGenerator(text: String, txtResult: TextView) {
            if (text.isNotBlank()) {

                if () {}
                else {}
            } else {
                Toast.makeText(this, "informe un numero entre 6 e 15", Toast.LENGTH_LONG).show() //padrao de pop-up
            }
    }

}



