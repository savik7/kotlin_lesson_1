package com.savik.kotlin_lesson_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var number:Int = 123
    private var text:String = "В магазине <осталось> $number <яблока>, а <может> и больше <кто> знает"
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


        var counter:Int = 0
        var startPcounter:Int = 0
        var endPcounter:Int = 0
        for (n in text.indices){
            if (text.get(n) == '<'){
                counter++
            }
        }
        var startPosition = IntArray(counter)
        var endPosition = IntArray(counter)

        for (n in text.indices){
            if (text.get(n) == '<'){
                startPosition[startPcounter] = n
                startPcounter++
            }
            if (text.get(n) == '>'){
                endPosition[endPcounter] = n
                endPcounter++
            }

        }
        var textFoundArray = Array(counter){""}
        for (n in startPosition.indices){
            textFoundArray[n] = text.substring(startPosition[n] + 1, endPosition[n])
            Log.d("myLog", textFoundArray[n])
        }

        tvText2?.setText(counter.toString())
    }

}