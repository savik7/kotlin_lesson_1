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
        var subText:String = text.substringAfter('<')
        var ssubText:String = subText.substringBefore('>')
        tvText?.setText(ssubText)

        tvText2 = findViewById(R.id.tvText2)
        var subText3:String = text.substringAfter('>')
        var subText4:String = subText3.substringAfterLast('<')
        var subText5:String = subText4.substringBeforeLast('>')
        tvText2?.setText(subText5)


    }

}