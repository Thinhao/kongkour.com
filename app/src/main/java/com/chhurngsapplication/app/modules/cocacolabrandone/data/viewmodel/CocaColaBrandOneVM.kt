package com.chhurngsapplication.app.modules.cocacolabrandone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.cocacolabrandone.`data`.model.CocaColaBrandOneModel
import org.koin.core.KoinComponent

class CocaColaBrandOneVM : ViewModel(), KoinComponent {
  val cocaColaBrandOneModel: MutableLiveData<CocaColaBrandOneModel> =
      MutableLiveData(CocaColaBrandOneModel())

  var navArguments: Bundle? = null
}
