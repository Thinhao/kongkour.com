package com.chhurngsapplication.app.modules.fordbrand.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.fordbrand.`data`.model.FordBrandModel
import org.koin.core.KoinComponent

class FordBrandVM : ViewModel(), KoinComponent {
  val fordBrandModel: MutableLiveData<FordBrandModel> = MutableLiveData(FordBrandModel())

  var navArguments: Bundle? = null
}
