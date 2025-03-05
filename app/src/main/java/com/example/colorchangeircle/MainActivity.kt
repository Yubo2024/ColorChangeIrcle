package com.example.colorchangeircle

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.colorchangeircle.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.changeColorButton.setOnClickListener {
            changeCircleColor(binding.circle1)
            changeCircleColor(binding.circle2)
            changeCircleColor(binding.circle3)
        }
    }

    // 修改圆形颜色
    private fun changeCircleColor(view: android.view.View) {
        val randomColor = Color.rgb(
            Random.nextInt(256),
            Random.nextInt(256),
            Random.nextInt(256)
        )
        view.backgroundTintList = ColorStateList.valueOf(randomColor) // 保持Shape Drawable不变，仅修改颜色
    }
}
