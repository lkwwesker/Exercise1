package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //set up function when button clicked
        buttonCalculate.setOnClickListener{cal()}
        buttonReset.setOnClickListener{reset()}
    }
    private fun cal(){
        Toast.makeText(this, "Car Loan calculated",
            Toast.LENGTH_SHORT).show()

        var carprice =  editTextCarPrice.text.toString().toDouble()
        var downpay = editTextDownPayment.text.toString().toDouble()
        var interestrate = editTextInterestRate.text.toString().toDouble()
        var loanyear = editTextLoanPeriod.text.toString().toInt()

        val carloan1 = carprice - downpay
        val interest1 = carloan1 * interestrate * loanyear
        val monthpay1 = (carloan1 + interest1)/ loanyear/12

        // fix the results at 2 decimal points
        val carloan:Double = String.format("%.2f",carloan1).toDouble()
        val interest:Double = String.format("%.2f",interest1).toDouble()
        val monthpay:Double = String.format("%.2f",monthpay1).toDouble()

        // print results
        textViewLoan.setText("Car loan = "+carloan)
        textViewInterest.setText("Interest = "+interest)
        textViewMonthlyRepayment.setText("Monthly repayment = "+monthpay)

    }
    private fun reset(){
        editTextCarPrice.setText(null)
        editTextDownPayment.setText(null)
        editTextInterestRate.setText(null)
        editTextLoanPeriod.setText(null)
        textViewLoan.setText(null)
        textViewInterest.setText(null)
        textViewMonthlyRepayment.setText(null)
    }
}
