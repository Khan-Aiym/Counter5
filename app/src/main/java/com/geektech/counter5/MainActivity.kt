package com.geektech.counter5

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.geektech.counter5.databinding.ActivityMainBinding
import com.geektech.counter5.model.view.CounterView
import com.geektech.counter5.presenter.CounterPresenter

class MainActivity : AppCompatActivity(), CounterView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = CounterPresenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            incrementBtn.setOnClickListener {
                presenter.increment()

            }
            decrementBtn.setOnClickListener {
                presenter.decrement()
            }

        }
    }

    override fun Color() {
        binding.resultTv.setBackgroundColor(Color.GREEN)

    }

    override fun ShowNewCount() {
        Toast.makeText(this, "10", Toast.LENGTH_SHORT).show()

    }

    override fun sowDecriment() {
        Toast.makeText(this, "-10", Toast.LENGTH_SHORT).show()
    }

    override fun resultCount(count: String) {
        binding.resultTv.text =count
    }


}