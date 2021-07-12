package com.example.maytinhbotui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tv = findViewById<TextView>(R.id.tv)
        var edt = findViewById<TextView>(R.id.edt)

        val chia = findViewById<Button>(R.id.chia)
        val nhan = findViewById<Button>(R.id.nhan)
        val cong = findViewById<Button>(R.id.cong)
        val tru = findViewById<Button>(R.id.tru)
        val mot = findViewById<Button>(R.id.mot)
        val hai = findViewById<Button>(R.id.hai)
        val ba = findViewById<Button>(R.id.ba)
        val bon = findViewById<Button>(R.id.bon)
        val nam = findViewById<Button>(R.id.nam)
        val sau = findViewById<Button>(R.id.sau)
        val bay = findViewById<Button>(R.id.bay)
        val tam = findViewById<Button>(R.id.tam)
        val chin = findViewById<Button>(R.id.chin)
        val xoa = findViewById<Button>(R.id.xoa)
        val cham = findViewById<Button>(R.id.cham)
        val bang = findViewById<Button>(R.id.bang)

        xoa.setOnClickListener {

            edt.setText("")
        }
        chia.setOnClickListener {
            val a = edt.text.toString() + "/"
            edt.setText(a)
        }
        nhan.setOnClickListener {
            val a = edt.text.toString() + "*"
            edt.setText(a)
        }
        cong.setOnClickListener {
            val a = edt.text.toString() + "+"
            edt.setText(a)
        }
        tru.setOnClickListener {
            val a = edt.text.toString() + "-"
            edt.setText(a)
        }
        mot.setOnClickListener {
            val a = edt.text.toString() + "1"
            edt.setText(a)
        }
        hai.setOnClickListener {
            val a = edt.text.toString() + "2"
            edt.setText(a)
        }
        ba.setOnClickListener {
            val a = edt.text.toString() + "3"
            edt.setText(a)
        }
        bon.setOnClickListener {
            val a = edt.text.toString() + "4"
            edt.setText(a)
        }
        nam.setOnClickListener {
            val a = edt.text.toString() + "5"
            edt.setText(a)
        }
        sau.setOnClickListener {
            val a = edt.text.toString() + "6"
            edt.setText(a)
        }
        bay.setOnClickListener {
            val a = edt.text.toString() + "7"
            edt.setText(a)
        }
        tam.setOnClickListener {
            val a = edt.text.toString() + "8"
            edt.setText(a)
        }
        chin.setOnClickListener {
            val a = edt.text.toString() + "9"
            edt.setText(a)
        }
        cham.setOnClickListener {
            val a = edt.text.toString() + "."
            edt.setText(a)
        }

        bang.setOnClickListener {
            try {
                val input = ExpressionBuilder(edt.text.toString()).build()
                val output = input.evaluate()
                val longOutput = output.toLong()
                Log.e("aaa", longOutput.toString())
                if (output == longOutput.toDouble()) {
                    tv.setText(longOutput.toString())
                } else {
                    tv.setText(output.toString())
                }
            } catch (e: Exception) {
                Toast.makeText(this@MainActivity, e.message, Toast.LENGTH_LONG).show()
            }
        }

    }
}
