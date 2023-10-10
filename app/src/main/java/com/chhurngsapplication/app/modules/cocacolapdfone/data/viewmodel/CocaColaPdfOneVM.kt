package com.chhurngsapplication.app.modules.cocacolapdfone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.cocacolapdfone.`data`.model.CocaColaPdfOneModel
import org.koin.core.KoinComponent

class CocaColaPdfOneVM : ViewModel(), KoinComponent {
  val cocaColaPdfOneModel: MutableLiveData<CocaColaPdfOneModel> =
      MutableLiveData(CocaColaPdfOneModel())

  var navArguments: Bundle? = null
}
