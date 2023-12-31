package com.devlucaslima.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.Display
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn0 = findViewById<Button>(R.id.btn0)
        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)
        var btn3 = findViewById<Button>(R.id.btn3)
        var btn4 = findViewById<Button>(R.id.btn4)
        var btn5 = findViewById<Button>(R.id.btn5)
        var btn6 = findViewById<Button>(R.id.btn6)
        var btn7 = findViewById<Button>(R.id.btn7)
        var btn8 = findViewById<Button>(R.id.btn8)
        var btn9 = findViewById<Button>(R.id.btn9)
        var btnDot = findViewById<Button>(R.id.btnDot)
        var btnBackspace = findViewById<Button>(R.id.btnBackspace)
        var Display1 = findViewById<TextView>(R.id.txtDisplay)
        var Display1Editable = Display1.text as Editable

        btn0.setOnClickListener{
            if(Display1.text == "0"){
                Display1.text = "0"
            } else {
                Display1.append("0")
            }
        }
        btn1.setOnClickListener{
            if(Display1.text == "0"){
                Display1.text = "1"
            } else {
                Display1.append("1")
            }
        }
        btn2.setOnClickListener{
            if(Display1.text == "0"){
                Display1.text = "2"
            } else {
                Display1.append("2")
            }
        }
        btn3.setOnClickListener{
            if(Display1.text == "0"){
                Display1.text = "3"
            } else {
                Display1.append("3")
            }
        }
        btn4.setOnClickListener{
            if(Display1.text == "0"){
                Display1.text = "4"
            } else {
                Display1.append("4")
            }
        }
        btn5.setOnClickListener{
            if(Display1.text == "0"){
                Display1.text = "5"
            } else {
                Display1.append("5")
            }
        }
        btn6.setOnClickListener{
            if(Display1.text == "0"){
                Display1.text = "6"
            } else {
                Display1.append("6")
            }
        }
        btn7.setOnClickListener{
            if(Display1.text == "0"){
                Display1.text = "7"
            } else {
                Display1.append("7")
            }
        }
        btn8.setOnClickListener{
            if(Display1.text == "0"){
                Display1.text = "8"
            } else {
                Display1.append("8")
            }
        }
        btn9.setOnClickListener{
            if(Display1.text == "0"){
                Display1.text = "9"
            } else {
                Display1.append("9")
            }
        }
        btnDot.setOnClickListener{
            if(Display1.text != "0"){
            Display1.append(".")
            }
        }
        btnBackspace.setOnClickListener{
            if(Display1.text != "0" || Display1.length() != 1){
                Display1Editable.delete(Display1Editable.length - 1, Display1Editable.length)
            }
        }
    }
}