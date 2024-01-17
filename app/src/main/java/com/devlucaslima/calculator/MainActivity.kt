package com.devlucaslima.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder
import java.text.DecimalFormat
import kotlin.math.absoluteValue
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
        val btnBackspace = findViewById<ImageButton>(R.id.btnBackspace)
        val btnPlus = findViewById<Button>(R.id.btnPlus)
        val btnMinus = findViewById<Button>(R.id.btnMinus)
        val btnTimes = findViewById<Button>(R.id.btnTimes)
        val btnDivision = findViewById<Button>(R.id.btnDivision)
        val btnPower = findViewById<Button>(R.id.btnPower)
        val btnParentheses = findViewById<Button>(R.id.btnParentheses)
        val btnAC = findViewById<Button>(R.id.btnAC)
        val btnEqual = findViewById<Button>(R.id.btnEqual)
        val display1 = findViewById<TextView>(R.id.txtDisplay)
        var nParentheses = 0
        var haveDot = false
        var haveDotMaster = false
        var openParentheses = false

        //algumas outras variáveis

        //Funcionalidade dos botões
        btn0.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "0"

            if (display1String.isNotEmpty() && ")".contains(display1String.last())){
                openParentheses = false
            } else if (display1String.isNotEmpty() && "(".contains(display1String.last())) {
                openParentheses = true
            }
        }
        btn1.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "1"

            if (display1String.isNotEmpty() && ")".contains(display1String.last())){
                openParentheses = false
            } else if (display1String.isNotEmpty() && "(".contains(display1String.last())) {
                openParentheses = true
            }
        }
        btn2.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "2"

            if (display1String.isNotEmpty() && ")".contains(display1String.last())){
                openParentheses = false
            } else if (display1String.isNotEmpty() && "(".contains(display1String.last())) {
                openParentheses = true
            }
        }
        btn3.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "3"

            if (display1String.isNotEmpty() && ")".contains(display1String.last())){
                openParentheses = false
            } else if (display1String.isNotEmpty() && "(".contains(display1String.last())) {
                openParentheses = true
            }
        }
        btn4.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "4"

            if (display1String.isNotEmpty() && ")".contains(display1String.last())){
                openParentheses = false
            } else if (display1String.isNotEmpty() && "(".contains(display1String.last())) {
                openParentheses = true
            }
        }
        btn5.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "5"

            if (display1String.isNotEmpty() && ")".contains(display1String.last())){
                openParentheses = false
            } else if (display1String.isNotEmpty() && "(".contains(display1String.last())) {
                openParentheses = true
            }
        }
        btn6.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "6"

            if (display1String.isNotEmpty() && ")".contains(display1String.last())){
                openParentheses = false
            } else if (display1String.isNotEmpty() && "(".contains(display1String.last())) {
                openParentheses = true
            }
        }
        btn7.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "7"

            if (display1String.isNotEmpty() && ")".contains(display1String.last())){
                openParentheses = false
            } else if (display1String.isNotEmpty() && "(".contains(display1String.last())) {
                openParentheses = true
            }
        }
        btn8.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "8"

            if (display1String.isNotEmpty() && ")".contains(display1String.last())){
                openParentheses = false
            } else if (display1String.isNotEmpty() && "(".contains(display1String.last())) {
                openParentheses = true
            }
        }
        btn9.setOnClickListener{
            val display1String = display1.text.toString()
            display1.text = display1String + "9"

            if (display1String.isNotEmpty() && ")".contains(display1String.last())){
                openParentheses = false
            } else if (display1String.isNotEmpty() && "(".contains(display1String.last())) {
                openParentheses = true
            }
        }
        btnDot.setOnClickListener{
            val display1String = display1.text.toString()
            if (!haveDot && display1String.isNotEmpty()) {
                if (!"+-*/^.()".contains(display1String.last())){
                    display1.append(".")
                    haveDot = true
                }
            } else {
                display1.text = display1String
            }
        }
        btnPlus.setOnClickListener{
            val display1String = display1.text.toString()

            if (display1String.isNotEmpty() && ")".contains(display1String.last())){
                openParentheses = false
            }
            if (display1String.isNotEmpty() && "(".contains(display1String.last())) {
                display1.text = display1String
            } else if (display1String.isNotEmpty() && "+-*/^.".contains(display1String.last())) {
                if (display1String.length == 1 && display1String.contains("-")){
                    display1.text = display1String
                } else if (!"+-*/^.".contains(display1String[display1String.length - 2])){
                    display1.text = display1String.dropLast(1) + "+"
                    haveDotMaster = haveDot
                    haveDot = false
                } else {
                    display1.text = display1String
                }
            } else if (display1String.isNotEmpty()) {
                display1.text = display1String + "+"
                haveDotMaster = haveDot
                haveDot = false
            }
        }
        btnMinus.setOnClickListener{
            val display1String = display1.text.toString()
            if (display1String.length == 1 && "+-*/^.".contains(display1String.last())){
                display1.text = display1String.dropLast(1) + "-"
                haveDotMaster = haveDot
                haveDot = false
            } else {
                if (display1String.isNotEmpty() && "+-.".contains(display1String.last())) {
                    display1.text = display1String.dropLast(1) + "-"
                    haveDotMaster = haveDot
                    haveDot = false
                } else {
                    display1.text = display1String + "-"
                    haveDotMaster = haveDot
                    haveDot = false
                }
            }
            if (display1String.isNotEmpty() && ")".contains(display1String.last())){
                openParentheses = false
            } else if (display1String.isNotEmpty() && "(".contains(display1String.last())) {
                openParentheses = true
            }
        }
        btnTimes.setOnClickListener{
            val display1String = display1.text.toString()

            if (display1String.isNotEmpty() && ")".contains(display1String.last())){
                openParentheses = false
            }
            if (display1String.isNotEmpty() && "(".contains(display1String.last())) {
                display1.text = display1String
            } else if (display1String.isNotEmpty() && "+-*/^.".contains(display1String.last())) {
                if (display1String.length == 1 && display1String.contains("-")){
                    display1.text = display1String
                } else if (!"+-*/^.".contains(display1String[display1String.length - 2])){
                    display1.text = display1String.dropLast(1) + "*"
                    haveDotMaster = haveDot
                    haveDot = false
                } else {
                    display1.text = display1String
                }
            } else if (display1String.isNotEmpty()) {
                display1.text = display1String + "*"
                haveDotMaster = haveDot
                haveDot = false
            }

        }
        btnDivision.setOnClickListener{
            val display1String = display1.text.toString()

            if (display1String.isNotEmpty() && ")".contains(display1String.last())){
                openParentheses = false
            }
            if (display1String.isNotEmpty() && "(".contains(display1String.last())) {
                display1.text = display1String
            } else if (display1String.isNotEmpty() && "+-*/^.".contains(display1String.last())) {
                if (display1String.length == 1 && display1String.contains("-")){
                    display1.text = display1String
                } else if (!"+-*/^.".contains(display1String[display1String.length - 2])){
                    display1.text = display1String.dropLast(1) + "/"
                    haveDotMaster = haveDot
                    haveDot = false
                } else {
                    display1.text = display1String
                }
            } else if (display1String.isNotEmpty()) {
                display1.text = display1String + "/"
                haveDotMaster = haveDot
                haveDot = false
            }

        }
        btnPower.setOnClickListener{
            val display1String = display1.text.toString()

            if (display1String.isNotEmpty() && ")".contains(display1String.last())){
                openParentheses = false
            }
            if (display1String.isNotEmpty() && "(".contains(display1String.last())) {
                display1.text = display1String
            } else if (display1String.isNotEmpty() && "+-*/^.".contains(display1String.last())) {
                if (display1String.length == 1 && display1String.contains("-")){
                    display1.text = display1String
                } else if (!"+-*/^.".contains(display1String[display1String.length - 2])){
                    display1.text = display1String.dropLast(1) + "^"
                    haveDotMaster = haveDot
                    haveDot = false
                } else {
                    display1.text = display1String
                }
            } else if (display1String.isNotEmpty()) {
                display1.text = display1String + "^"
                haveDotMaster = haveDot
                haveDot = false
            }
        }
        btnParentheses.setOnClickListener{
            val display1String = display1.text.toString()

            if (display1String == ""){
                display1.text = display1String + "("
                nParentheses++
            } else {
                if (display1String.isNotEmpty() && "(".contains(display1String.last())){
                    display1.text = display1String + "("
                    nParentheses++
                } else if (!openParentheses) {
                    display1.text = display1String + "("
                    nParentheses++
                }
            }
            if (display1String.isNotEmpty() && nParentheses > 0 && !"(".contains(display1String.last()) && !"+-*/^.(".contains(display1String.last())){
                if (display1String.isNotEmpty() && ")".contains(display1String.last())){
                    display1.text = display1String + ")"
                    nParentheses--
                } else if (openParentheses) {
                    display1.text = display1String + ")"
                    nParentheses--
                }
            }
        }
        btnAC.setOnClickListener{
            haveDot = false
            openParentheses = false
            nParentheses = 0
            display1.text = ""
        }
        btnBackspace.setOnClickListener{
            val display1String = display1.text.toString()

            if (display1String.isNotEmpty() && "(".contains(display1String.last())){
                nParentheses--
            } else if (display1String.isNotEmpty() && ")".contains(display1String.last())){
                nParentheses++
            }
            if (display1String.isNotEmpty() && "+-*/^".contains(display1String.last())) {
                if (haveDotMaster) {
                    haveDot = true
                } else {
                    haveDot = false
                }
            }
            if (display1String.isNotEmpty() && display1String.endsWith(".")){
                haveDot = false
            }
            if (display1String.isNotEmpty()) {
                val display1Backspace = display1String.substring(0, display1String.length - 1)
                display1.text = display1Backspace
                if (display1String.isNotEmpty() && "(".contains(display1String.last())){
                    openParentheses = false
                }
            }
        }
        btnEqual.setOnClickListener {
            val expression = display1.text.toString()

            if (expression.isNotEmpty() && !"+-*/^".contains(expression.last())){
                try {
                    val result = ExpressionBuilder(expression).build().evaluate()
                    val display1String = display1.text.toString()

                    val formattedResult = if (result.absoluteValue >= 1e10) {
                        val decimalFormat = DecimalFormat("0.#########E0")
                        decimalFormat.format(result)
                    } else {
                        result.toString()
                    }
                    if (formattedResult.contains("E")){
                        display1.text = formattedResult
                    } else if (formattedResult.contains(".") && !"0".contains(formattedResult.last())){
                        display1.text = formattedResult
                    } else if("+-*/^".contains(formattedResult.last())) {
                        display1.text = display1String
                    } else {
                        val transformInt = formattedResult.substring(0, formattedResult.length - 2)
                        display1.text = transformInt
                    }
                } catch (e: Exception) {
                    display1.text = "Error"
                }
            }
        }
    }
}

