package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ok.setOnClickListener{cal()}
    }
    private fun cal(){
        Toast.makeText(this, "Car Loan calculated",
            Toast.LENGTH_SHORT).show()

        var carprice =  car_price.text.toString().toDouble()
        var downpay = down_payment.text.toString().toDouble()
        var interestrate = interest_rate.text.toString().toInt()
        var loanyear = loan_year.text.toString().toDouble()

        val carloan1 = carprice - downpay
        val interest1 = carloan1 * interestrate * loanyear
        val monthpay1 = (carloan1 + interest1)/ loanyear/12
        val carloan:Double = String.format("%.2f",carloan1).toDouble()
        val interest:Double = String.format("%.2f",interest1).toDouble()
        val monthpay:Double = String.format("%.2f",monthpay1).toDouble()

        car_loan.setText("Car loan = "+carloan)
        Interest.setText("Interest = "+interest)
        monthy_repay.setText("Monthly repayment = "+monthpay)

    }
}
