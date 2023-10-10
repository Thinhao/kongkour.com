package com.chhurngsapplication.app.modules.cocacolabrand.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.cocacolabrand.`data`.model.CocaColaBrandModel
import org.koin.core.KoinComponent

class CocaColaBrandVM : ViewModel(), KoinComponent {
  val cocaColaBrandModel: MutableLiveData<CocaColaBrandModel> =
      MutableLiveData(CocaColaBrandModel())

  var navArguments: Bundle? = null
}
