import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.operaciones.R

class MainActivity : AppCompatActivity() {

    private lateinit var numero1: EditText
    private lateinit var numero2: EditText
    private lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numero1 = findViewById(R.id.numero1)
        numero2 = findViewById(R.id.numero2)
        resultado = findViewById(R.id.resultado)

        val btnSuma: Button = findViewById(R.id.btnSuma)
        val btnResta: Button = findViewById(R.id.btnResta)
        val btnMultiplicacion: Button = findViewById(R.id.btnMultiplicacion)
        val btnDivision: Button = findViewById(R.id.btnDivision)

        btnSuma.setOnClickListener { realizarOperacion('+') }
        btnResta.setOnClickListener { realizarOperacion('-') }
        btnMultiplicacion.setOnClickListener { realizarOperacion('*') }
        btnDivision.setOnClickListener { realizarOperacion('/') }
    }

    private fun realizarOperacion(operador: Char) {
        val num1 = numero1.text.toString().toDouble()
        val num2 = numero2.text.toString().toDouble()
        val resultadoOperacion: Double

        when (operador) {
            '+' -> resultadoOperacion = num1 + num2
            '-' -> resultadoOperacion = num1 - num2
            '*' -> resultadoOperacion = num1 * num2
            '/' -> resultadoOperacion = num1 / num2
            else -> resultadoOperacion = 0.0
        }

        resultado.text = resultadoOperacion.toString()
    }
}
