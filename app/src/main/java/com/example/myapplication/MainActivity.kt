package com.example.myapplication

import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setNumbers()
        clickListeners()
    }

    private fun clickListeners() {
        binding.btnNumber1.btnNumber.setOnClickListener {
            var balance = binding.etBalance.text.toString()
            if(balance == "$0"){
                balance = ""
            }else
                balance = balance+"1"
            binding.etBalance.setText(balance)
            if(binding.etBalance.text.toString() != "$0"){
                binding.btnConfirm.visibility = View.VISIBLE
            }
        }
        binding.btnNumber2.btnNumber.setOnClickListener {
            var balance = binding.etBalance.text.toString()
            if(balance == "$0"){
                balance = ""
            }else
                balance = balance+"2"
            binding.etBalance.setText(balance)
            if(binding.etBalance.text.toString() != "$0"){
                binding.btnConfirm.visibility = View.VISIBLE
            }
        }
        binding.btnNumber3.btnNumber.setOnClickListener {
            var balance = binding.etBalance.text.toString()
            if(balance == "$0"){
                balance = ""
            }else
                balance = balance+"3"
            binding.etBalance.setText(balance)
            if(binding.etBalance.text.toString() != "$0"){
                binding.btnConfirm.visibility = View.VISIBLE
            }
        }
        binding.btnNumber4.btnNumber.setOnClickListener {
            var balance = binding.etBalance.text.toString()
            if(balance == "$0"){
                balance = ""
            }else
                balance = balance+"4"
            binding.etBalance.setText(balance)
            if(binding.etBalance.text.toString() != "$0"){
                binding.btnConfirm.visibility = View.VISIBLE
            }
        }
        binding.btnNumber5.btnNumber.setOnClickListener {
            var balance = binding.etBalance.text.toString()
            if(balance == "$0"){
                balance = ""
            }else
                balance = balance+"5"
            binding.etBalance.setText(balance)
            if(binding.etBalance.text.toString() != "$0"){
                binding.btnConfirm.visibility = View.VISIBLE
            }
        }
        binding.btnNumber6.btnNumber.setOnClickListener {
            var balance = binding.etBalance.text.toString()
            if(balance == "$0"){
                balance = ""
            }else
                balance = balance+"6"
            binding.etBalance.setText(balance)
            if(binding.etBalance.text.toString() != "$0"){
                binding.btnConfirm.visibility = View.VISIBLE
            }
        }
        binding.btnNumber7.btnNumber.setOnClickListener {
            var balance = binding.etBalance.text.toString()
            if(balance == "$0"){
                balance = ""
            }else
                balance = balance+"7"
            binding.etBalance.setText(balance)
            if(binding.etBalance.text.toString() != "$0"){
                binding.btnConfirm.visibility = View.VISIBLE
            }
        }
        binding.btnNumber8.btnNumber.setOnClickListener {
            var balance = binding.etBalance.text.toString()
            if(balance == "$0"){
                balance = ""
            }else
                balance = balance+"8"
            binding.etBalance.setText(balance)
            if(binding.etBalance.text.toString() != "$0"){
                binding.btnConfirm.visibility = View.VISIBLE
            }
        }
        binding.btnNumber9.btnNumber.setOnClickListener {
            var balance = binding.etBalance.text.toString()
            if(balance == "$0"){
                balance = ""
            }else
                balance = balance+"9"
            binding.etBalance.setText(balance)
            if(binding.etBalance.text.toString() != "$0"){
                binding.btnConfirm.visibility = View.VISIBLE
            }
        }
        binding.btnNumber0.btnNumber.setOnClickListener {
            var balance = binding.etBalance.text.toString()
            if(balance == "$0"){
                balance = ""
            }else
                balance = balance+"0"
            binding.etBalance.setText(balance)
            if(binding.etBalance.text.toString() != "$0"){
                binding.btnConfirm.visibility = View.VISIBLE
            }
        }
        binding.btnNumberCancel.btnNumber.setOnClickListener {
            var balance = "0"
            if(binding.etBalance.text.toString() != "$0"){
                balance = binding.etBalance.text.toString()
                balance = balance.substring(0,balance.length-1)
            }
            binding.etBalance.setText(balance)
            if(binding.etBalance.text.toString() == "$0"){
                binding.btnConfirm.visibility = View.GONE
            }
        }
    }

    private fun setNumbers() {
        binding.btnNumber1.btnNumber.text = "1"
        binding.btnNumber2.btnNumber.text = "2"
        binding.btnNumber3.btnNumber.text = "3"
        binding.btnNumber4.btnNumber.text = "4"
        binding.btnNumber5.btnNumber.text = "5"
        binding.btnNumber6.btnNumber.text = "6"
        binding.btnNumber7.btnNumber.text = "7"
        binding.btnNumber8.btnNumber.text = "8"
        binding.btnNumber9.btnNumber.text = "9"
        binding.btnNumberDot.btnNumber.text = "."
        binding.btnNumber0.btnNumber.text = "0"
        binding.btnNumberCancel.btnNumber.text = "*"
    }

}