package com.chhurngsapplication.app.modules.amdbrand.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.amdbrand.`data`.model.AmdBrandModel
import org.koin.core.KoinComponent

class AmdBrandVM : ViewModel(), KoinComponent {
  val amdBrandModel: MutableLiveData<AmdBrandModel> = MutableLiveData(AmdBrandModel())

  var navArguments: Bundle? = null
}
