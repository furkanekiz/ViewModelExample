package com.furkanekiz.viewmodelexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ACMainViewModel(startingTotal: Int) : ViewModel() {

    private var total = MutableLiveData<Int>()
    val totalData: LiveData<Int>
        get() = total

    val inputText = MutableLiveData<String>()

    init {
        total.value = startingTotal
    }

    /*fun getTotal(): Int {
        return total
    }*/

    /*fun setTotal(number: Int) {
        total.value = (total.value)?.plus(number)
    }*/

    fun setTotal() {
        val intInput: Int = inputText.value!!.toInt()
        total.value = (total.value)?.plus(intInput)
    }
}