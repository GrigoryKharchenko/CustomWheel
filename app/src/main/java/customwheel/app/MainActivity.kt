package customwheel.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.slider.Slider
import customwheel.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        with(binding) {
            setContentView(root)
            sliderSizeWheel.value = wheel.ratioWheel

            sliderSizeWheel.addOnChangeListener(Slider.OnChangeListener { _, value, _ ->
                wheel.changingWheelSize(value)
            })
        }
    }
}
