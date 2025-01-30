package co.tiagoaguiar.ganheinamega

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //where you decided what the app will do
        setContentView(R.layout.activity_main)

        //search for the objects and get their reference
        val editText: EditText = findViewById(R.id.edit_number)
        val txtResult: TextView = findViewById(R.id.txt_result)
        val btnGenerate: Button = findViewById(R.id.btn_generate)

        btnGenerate.setOnClickListener {
            val text = editText.text.toString()
            numberGenerator(text, txtResult)
        }

    }

    private fun numberGenerator(text: String, txtResult: TextView) {
        if (text.isEmpty()) {

            Toast.makeText(this, "Informe un numero entre 6 e 15", Toast.LENGTH_LONG).show()
            return
        }

        val qdt = text.toInt() //input string to int

        if (qdt < 6 || qdt > 15) {
            Toast.makeText(this, "Informe un numero entre 6 e 15", Toast.LENGTH_LONG).show()
            return //this is for avoid the else block and break the if statement
        }

        val numbers = mutableSetOf<Int>()
        val random = Random()

        while (true) {
            val number = random.nextInt(60) //0...59
            numbers.add(number + 1)

            if (numbers.size == qdt) {
                break
            }
        }

        txtResult.text = numbers.joinToString(" - ")
    }
}




