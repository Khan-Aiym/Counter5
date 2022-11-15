package com.geektech.counter5.helper

import com.geektech.counter5.model.CounterModel
import com.geektech.counter5.presenter.CounterPresenter

class injector {
    companion object
    fun getModel(): CounterModel {
        return CounterModel()
     }
    fun getPresenter(): CounterPresenter{
        return  CounterPresenter()
    }

}