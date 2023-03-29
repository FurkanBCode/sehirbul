package com.example.ehirbulma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.ehirbulma.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        binding.button.setOnClickListener{
            if (binding.editTextNumber.text.isNotEmpty()) {
                var plakaKodu = binding.editTextNumber.text.toString().toInt()
                when(plakaKodu){
                    35 -> binding.textView.text ="izmir"
                    34 -> binding.textView.text ="istanbul"
                    55 -> binding.textView.text ="samsun"
                    1 -> binding.textView.text ="adana"
                    10 -> binding.textView.text ="balıkesir"
                    45 -> binding.textView.text ="manisa"

                }

            }else {
                binding.textView.text="Şehir plaka giriniz"
            }
        }

        val button=findViewById<Button>(R.id.button2)

        button.setOnClickListener {

            val Intent= Intent(this,sayfa::class.java)
            startActivity(Intent)
        }


    }
}