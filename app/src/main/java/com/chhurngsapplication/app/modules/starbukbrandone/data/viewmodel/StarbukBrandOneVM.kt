package com.chhurngsapplication.app.modules.starbukbrandone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.starbukbrandone.`data`.model.StarbukBrandOneModel
import org.koin.core.KoinComponent

class StarbukBrandOneVM : ViewModel(), KoinComponent {
  val starbukBrandOneModel: MutableLiveData<StarbukBrandOneModel> =
      MutableLiveData(StarbukBrandOneModel())

  var navArguments: Bundle? = null
}
