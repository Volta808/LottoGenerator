package com.example.lottogenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    public fun generer(view : View) {
        var liste = getNumbers()
        var text1 = findViewById(R.id.textView) as TextView
        var text2 = findViewById(R.id.textView2) as TextView
        var text3 = findViewById(R.id.textView3) as TextView
        text1.setText(liste[0].toString())
        text2.setText(liste[1].toString())
        text3.setText(liste[2].toString())

    }

    fun getNumbers():List<MutableList<Int>>{
        var liste = List<MutableList<Int>>(3){MutableList<Int>(0){1}}

        for (item in 0..2){
            for(i in 1..7){
                while(true){
                    var number = Random.nextInt((50 + 1) - 1) + 1
                    if(!liste[0].contains(number) && !liste[1].contains(number) && !liste[2].contains(number)) {
                        liste[item].add(number)
                        break;
                    }
                }
            }
        }
        return liste
    }
}

