package com.chhurngsapplication.app.modules.starbukbrand.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.starbukbrand.`data`.model.StarbukBrandModel
import org.koin.core.KoinComponent

class StarbukBrandVM : ViewModel(), KoinComponent {
  val starbukBrandModel: MutableLiveData<StarbukBrandModel> = MutableLiveData(StarbukBrandModel())

  var navArguments: Bundle? = null
}
