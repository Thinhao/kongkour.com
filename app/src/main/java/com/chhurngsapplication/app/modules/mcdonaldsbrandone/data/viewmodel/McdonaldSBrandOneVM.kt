package com.chhurngsapplication.app.modules.mcdonaldsbrandone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.mcdonaldsbrandone.`data`.model.McdonaldSBrandOneModel
import org.koin.core.KoinComponent

class McdonaldSBrandOneVM : ViewModel(), KoinComponent {
  val mcdonaldSBrandOneModel: MutableLiveData<McdonaldSBrandOneModel> =
      MutableLiveData(McdonaldSBrandOneModel())

  var navArguments: Bundle? = null
}
