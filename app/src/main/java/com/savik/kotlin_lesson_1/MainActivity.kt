package com.savik.kotlin_lesson_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private var number:Byte = 0 //-128 до 127 занимает 1 байт
    private var number1:Short = 0 //
    private var number2:Int = 0
    private var number3:Long = 0
    private var text:String = "whervbil vekbfwl ieurviuvl wkjev4iluh"
    private var ch:Char = 'f'

    private var tvText: TextView? = null
    private var cLayout: ConstraintLayout? = null
    private var counter:Int = 0
    private var start:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvText = findViewById(R.id.tvText)
        tvText?.setText(number.toString())

        cLayout = findViewById(R.id.cLayout)

        Thread{
            start = true
            while (start){
                Thread.sleep(1000)
                    runOnUiThread {
                        if (counter == 5) cLayout?.setBackgroundColor(Color.GREEN)
                        if (counter == 10) cLayout?.setBackgroundColor(Color.GRAY)
                        if (counter == 15) cLayout?.setBackgroundColor(Color.RED)
                        tvText?.setText(counter.toString())
                        counter++
                    }
            }
        }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        start = false
    }
}