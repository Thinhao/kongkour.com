package com.chhurngsapplication.app.modules.mcdonaldsbrand.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.mcdonaldsbrand.`data`.model.McdonaldSBrandModel
import org.koin.core.KoinComponent

class McdonaldSBrandVM : ViewModel(), KoinComponent {
  val mcdonaldSBrandModel: MutableLiveData<McdonaldSBrandModel> =
      MutableLiveData(McdonaldSBrandModel())

  var navArguments: Bundle? = null
}
