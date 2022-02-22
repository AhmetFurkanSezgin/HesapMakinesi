package com.afs.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.afs.hesapmakinesi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    var eskiSayi = ""
    var yeniSayi = ""
    var operator = ""
    private lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)
        tasarim.btnAC.setOnClickListener {

            tasarim.sayiGoster.text.clear()

        }
    }

fun btnSayiTik(view: View) {

    val btnSec = view as Button
    var btnTikDeger:String =tasarim.sayiGoster.text.toString()


when (btnSec.id){
    tasarim.btn0.id ->{

        btnTikDeger+="0"
    }
    tasarim.btn1.id ->{

        btnTikDeger+="1"
    }
    tasarim.btn2.id ->{

        btnTikDeger+="2"
    }
    tasarim.btn3.id ->{

        btnTikDeger+="3"
    }
    tasarim.btn4.id ->{

        btnTikDeger+="4"
    }
    tasarim.btn5.id ->{

        btnTikDeger+="5"
    }
    tasarim.btn6.id ->{

        btnTikDeger+="6"
    }
    tasarim.btn7.id ->{

        btnTikDeger+="7"
    }
    tasarim.btn8.id ->{

        btnTikDeger+="8"
    }
    tasarim.btn9.id ->{

        btnTikDeger+="9"
    }





}

    tasarim.sayiGoster.setText(btnTikDeger)
}


    fun btnOpTik(view: View) {

        val btnSec=view as Button
        //çarpma,bölme gibi başka operatörler de kullanılmak istendiğinde ekleme yapılabilir.
        when(btnSec.id){
    tasarim.btnTopla.id -> {

        operator="+"
    }

        }
        eskiSayi=tasarim.sayiGoster.text.toString()
        tasarim.sayiGoster.text.clear()
        tasarim.sayiGoster.setText("+")

    }
    fun btnEsittirTik(view: View){
        yeniSayi=tasarim.sayiGoster.text.toString()
        var sonucSayisi:Double?=null
        when (operator){
            "+" -> {
                sonucSayisi=eskiSayi.toDouble()+yeniSayi.toDouble()
            }
        }
        tasarim.sayiGoster.setText(sonucSayisi.toString())



    }


}