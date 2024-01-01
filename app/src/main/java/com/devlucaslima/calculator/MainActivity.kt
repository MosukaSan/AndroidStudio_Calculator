package com.devlucaslima.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.widget.doOnTextChanged
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Botões
        val btn0 = findViewById<Button>(R.id.btn0)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)
        val btnDot = findViewById<Button>(R.id.btnDot)
        val btnBackspace = findViewById<Button>(R.id.btnBackspace)
        val btnPlus = findViewById<Button>(R.id.btnPlus)
        val btnMinus = findViewById<Button>(R.id.btnMinus)
        val btnTimes = findViewById<Button>(R.id.btnTimes)
        val btnDivision = findViewById<Button>(R.id.btnDivision)
        val btnPower = findViewById<Button>(R.id.btnPower)
        val btnAC = findViewById<Button>(R.id.btnAC)
        val btnEqual = findViewById<Button>(R.id.btnEqual)
        val display1 = findViewById<TextView>(R.id.txtDisplay)
        val displayResultado = findViewById<TextView>(R.id.txtResultado)

        btn0.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "0"
        }
        btn1.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "1"
        }
        btn2.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "2"
        }
        btn3.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "3"
        }
        btn4.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "4"
        }
        btn5.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "5"
        }
        btn6.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "6"
        }
        btn7.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "7"
        }
        btn8.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "8"
        }
        btn9.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "9"
        }
        btnDot.setOnClickListener{

        }
        btnPlus.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "+"
        }
        btnMinus.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "-"
        }
        btnTimes.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "*"
        }
        btnDivision.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "/"
        }
        btnPower.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "^"
        }
        btnAC.setOnClickListener{
            display1.text = ""
        }
        btnBackspace.setOnClickListener{
            val display1String = display1.text.toString()
            if (display1String.isNotEmpty()) {
                val display1Backspace = display1String.substring(0, display1String.length - 1)
                display1.text = display1Backspace
            }
        }
        btnEqual.setOnClickListener {
            val expressao = display1.text.toString()

            try {
                val result = ExpressionBuilder(expressao).build().evaluate()
                val formattedResult = if (result % 1 == 0.0) {
                    result.toInt().toString()
                } else {
                    result.toString()
                }
                display1.text = formattedResult
            } catch (e: Exception) {
                display1.text = "Error"
            }
        }
    }
}

