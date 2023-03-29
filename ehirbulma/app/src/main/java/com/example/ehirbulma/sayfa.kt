package com.example.ehirbulma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.ehirbulma.databinding.ActivityMainBinding
import com.example.ehirbulma.databinding.ActivitySayfaBinding

class sayfa : AppCompatActivity() {
    lateinit var binding: ActivitySayfaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_sayfa)
        binding= ActivitySayfaBinding.inflate(layoutInflater)
        val sayfam = binding.root
        setContentView(sayfam)


        binding.button3.setOnClickListener{
            if (binding.editTextTextPersonName.text.isNotEmpty()) {
                var plakaKodu = binding.editTextTextPersonName.text.toString().toString()
                when(plakaKodu){

                    "izmir" -> binding.textView4.text ="otuzbeş"
                    "istanbul" -> binding.textView4.text ="otuzdört"
                    "Samsun" -> binding.textView4.text ="ellibeş"
                    "Bursa" -> binding.textView4.text ="onaltı"
                    "Adana" -> binding.textView4.text ="bir"

                }

            }else {
                binding.textView4.text="Şehir plaka giriniz"
            }
        }

        val button=findViewById<Button>(R.id.button4)

        button.setOnClickListener {

            val Intent= Intent(this,MainActivity::class.java)
            startActivity(Intent)
        }


        }
    }