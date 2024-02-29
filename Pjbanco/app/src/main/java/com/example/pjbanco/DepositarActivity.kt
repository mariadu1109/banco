package com.example.pjbanco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DepositarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_depositar)
        setSupportActionBar(findViewById(R.id.toolbar4))

        val saldo = intent.getStringExtra("sSaldo")
        val txtSaldo = findViewById<TextView>(R.id.txtsaldo3)
        txtSaldo.setText(saldo.toString())
    }
}