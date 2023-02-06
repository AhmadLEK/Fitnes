package com.example.joevaderstable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.joevaderstable.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btn1.setOnClickListener {

            val a = bindingClass.edNumber1.text.toString().toDouble()
            val b = bindingClass.edNumber2.text.toString().toDouble()
            val result = b / a
            bindingClass.textResult.text = result.toString()


        }

    }

    fun onClickBody(view: View) {
        val i = Intent(this, BodyActivity::class.java )
        i.putExtra("abc", "${bindingClass.textResult.text.toString().toDouble()}")
        startActivity(i)
    }

}

