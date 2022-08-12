package com.furkanekiz.viewmodelexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.furkanekiz.viewmodelexample.databinding.AcMainBinding

class ACMain : AppCompatActivity() {

    private lateinit var binding: AcMainBinding
    private lateinit var viewModel: ACMainViewModel
    private lateinit var viewModelFactory: ACMainViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.ac_main)
        viewModelFactory = ACMainViewModelFactory(125)
        viewModel = ViewModelProvider(this, viewModelFactory)[ACMainViewModel::class.java]

        viewModel.totalData.observe(this) {
            binding.tvTotal.text = it.toString()
        }

        binding.btnAdd.setOnClickListener {
            viewModel.setTotal(binding.etNumber.text.toString().toInt())
        }

    }
}
