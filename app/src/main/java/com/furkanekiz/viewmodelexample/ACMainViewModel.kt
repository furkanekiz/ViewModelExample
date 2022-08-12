package com.furkanekiz.viewmodelexample

import androidx.lifecycle.ViewModel

class ACMainViewModel(startingTotal: Int) : ViewModel() {
    private var total = 0

    init {
        total = startingTotal
    }

    fun getTotal(): Int {
        return total
    }

    fun setTotal(number: Int): Int {
        total += number
        return total
    }
}