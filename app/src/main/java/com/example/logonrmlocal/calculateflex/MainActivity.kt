package com.example.logonrmlocal.calculateflex

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.logonrmlocal.calculateflex.watchers.DecimalTextWatcher
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etGasPrice.addTextChangedListener(DecimalTextWatcher(etGasPrice))
        etEthanolPrice.addTextChangedListener(DecimalTextWatcher(etEthanolPrice))

        etGasAverage.addTextChangedListener(DecimalTextWatcher(etGasAverage,1))

        etEthanolAverage.addTextChangedListener(DecimalTextWatcher(etEthanolAverage,1))
        btCalculate.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("GAS_PRICE", etGasPrice.text.toString().toDouble())
            intent.putExtra("ETHANOL_PRICE", etEthanolPrice.text.toString().toDouble())
            intent.putExtra("GAS_AVERAGE", etGasAverage.text.toString().toDouble())
            intent.putExtra("ETHANOL_AVERAGE", etEthanolAverage.text.toString().toDouble())
            startActivity(intent)
        }
    }
}
