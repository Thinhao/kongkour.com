package com.chhurngsapplication.app.modules.fordbrandone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.fordbrandone.`data`.model.FordBrandOneModel
import org.koin.core.KoinComponent

class FordBrandOneVM : ViewModel(), KoinComponent {
  val fordBrandOneModel: MutableLiveData<FordBrandOneModel> = MutableLiveData(FordBrandOneModel())

  var navArguments: Bundle? = null
}
