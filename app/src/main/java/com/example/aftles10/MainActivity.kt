package com.example.aftles10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivPictureAnimals.setBackgroundResource(R.drawable.ob)

        btnSearch.setOnClickListener {

            val animals = edNameAnimals.text.toString()
            when (animals) {
                "кошка" -> ivPictureAnimals.setBackgroundResource(R.drawable.kat)
                "собака" -> ivPictureAnimals.setBackgroundResource(R.drawable.dog)
                "енот" -> ivPictureAnimals.setBackgroundResource(R.drawable.ent)
                "хомяк" -> ivPictureAnimals.setBackgroundResource(R.drawable.hom)
                "лев" -> ivPictureAnimals.setBackgroundResource(R.drawable.lev)
                "попугай" -> ivPictureAnimals.setBackgroundResource(R.drawable.popug)
                "сова" -> ivPictureAnimals.setBackgroundResource(R.drawable.sova)
                "тигр" -> ivPictureAnimals.setBackgroundResource(R.drawable.tigr)
                "змея" -> ivPictureAnimals.setBackgroundResource(R.drawable.zmy)
                else -> {
                    val toast =
                        Toast.makeText(this, "Не знаю такого :(", Toast.LENGTH_SHORT)
                        toast.setGravity(Gravity.TOP, 0, 256)
                    toast.show()
                }

            }
        }
    }
}