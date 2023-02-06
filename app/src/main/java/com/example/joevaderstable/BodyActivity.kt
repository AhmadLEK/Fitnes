package com.example.joevaderstable

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


import com.example.joevaderstable.databinding.ActivityBodyBinding


class BodyActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityBodyBinding

    @SuppressLint("ResourceType", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityBodyBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val message = intent.getStringExtra("abc")
        bindingClass.tv.text = message


        bindingClass.btnstr.setOnClickListener {
            val x = bindingClass.tv.text.toString().toDouble()

            bindingClass.apply {
                if (x >= 0.34) {
                    t1.text = "36"
                    t2.text = "33"
                    t3.text = "27"
                    t4.text = "92"
                    t5.text = "69"
                    t6.text = "83"
                    t7.text = "50"
                    t8.text = "33"
                }
                if (x >= 0.36) {
                    t1.text = "37"
                    t2.text = "34"
                    t3.text = "29"
                    t4.text = "96"
                    t5.text = "72"
                    t6.text = "87"
                    t7.text = "52"
                    t8.text = "34"

                }
                if (x >= 0.39) {
                    t1.text = "38"
                    t2.text = "36"
                    t3.text = "30"
                    t4.text = "100"
                    t5.text = "75"
                    t6.text = "90"
                    t7.text = "54"
                    t8.text = "36"
                }
                if (x >= 0.42) {
                    t1.text = "40"
                    t2.text = "38"
                    t3.text = "31"
                    t4.text = "104"
                    t5.text = "78"
                    t6.text = "93"
                    t7.text = "56"
                    t8.text = "38"
                }
                if (x >= 0.45) {
                    t1.text = "43"
                    t2.text = "40"
                    t3.text = "32"
                    t4.text = "107"
                    t5.text = "80"
                    t6.text = "96"
                    t7.text = "58"
                    t8.text = "40"
                }
                if (x >= 0.49) {
                    t1.text = "44"
                    t2.text = "42"
                    t3.text = "33"
                    t4.text = "110"
                    t5.text = "82"
                    t6.text = "100"
                    t7.text = "60"
                    t8.text = "42"
                }
                if (x >= 0.53) {
                    t1.text = "46"
                    t2.text = "44"
                    t3.text = "35"
                    t4.text = "116"
                    t5.text = "86"
                    t6.text = "105"
                    t7.text = "64"
                    t8.text = "45"
                }
                if (x >= 58){
                    t1.text = "48"
                    t2.text = "46"
                    t3.text = "38"
                    t4.text = "121"
                    t5.text = "90"
                    t6.text = "110"
                    t7.text = "67"
                    t8.text = "48"
                }
                if (x >= 0.65) {
                    t1.text = "55"
                    t2.text = "50"
                    t3.text = "43"
                    t4.text = "133"
                    t5.text = "99"
                    t6.text = "120"
                    t7.text = "74"
                    t8.text = "50"
                }

            }
        }
    }

    fun onClickClose(view: View){
        finish()
    }

}



