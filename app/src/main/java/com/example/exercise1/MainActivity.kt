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

        var carprice =  car_price.text.toString().toInt()
        var downpay = down_payment.text.toString().toInt()
        var interestrate = interest_rate.text.toString().toInt()
        var loanyear = loan_year.text.toString().toInt()

        val carloan = carprice - downpay
        val interest = carloan * interestrate * loanyear
        val monthpay = (carloan + interest)/ loanyear/12

        car_loan.setText("Car loan = "+carloan)
        Interest.setText("Interest = "+interest)
        monthy_repay.setText("Monthly repayment = "+monthpay)

    }
}
