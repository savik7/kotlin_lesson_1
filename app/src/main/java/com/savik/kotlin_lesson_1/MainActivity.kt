package com.savik.kotlin_lesson_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var number:Int = 123
    private var text:String = "В магазине <осталось> $number яблока, а может и больше <кто> знает"
    private var tvText: TextView? = null
    private var tvText2: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvText = findViewById(R.id.tvText)
        tvText2 = findViewById(R.id.tvText2)
        var subText:String = text.substringAfter('<')
        var ssubText:String = subText.substringBefore('>')
        tvText?.setText(ssubText)

        var subText2:String = text.substringAfterLast('<')
        var ssubText2:String = subText2.substringBeforeLast('>')
        tvText2?.setText(ssubText2)


    }

}