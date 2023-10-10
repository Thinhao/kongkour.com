package com.chhurngsapplication.app.modules.amdbrandone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.amdbrandone.`data`.model.AmdBrandOneModel
import org.koin.core.KoinComponent

class AmdBrandOneVM : ViewModel(), KoinComponent {
  val amdBrandOneModel: MutableLiveData<AmdBrandOneModel> = MutableLiveData(AmdBrandOneModel())

  var navArguments: Bundle? = null
}
