package com.geektech.counter5.presenter

import android.widget.Toast
import com.geektech.counter5.model.CounterModel
import com.geektech.counter5.model.view.CounterView

class CounterPresenter {
    private val model = CounterModel()
    lateinit var view: CounterView

    fun increment(){
        model.increment()
        view.resultCount(model.getCount().toString())
        if (model.getCount() ==10){
            view.ShowNewCount()
        }else if (model.getCount()==15){
            view.Color()
        }
    }

    fun decrement(){
        model.decrement()
        view.resultCount(model.getCount().toString())
        if (model.getCount()==-10) {
            view.sowDecriment()
        }
    }
fun attachView(view: CounterView)
{this.view=view
}


}
