package com.chhurngsapplication.app.modules.scooperpostsix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperpostsix.`data`.model.ScooperPostSixModel
import org.koin.core.KoinComponent

class ScooperPostSixVM : ViewModel(), KoinComponent {
  val scooperPostSixModel: MutableLiveData<ScooperPostSixModel> =
      MutableLiveData(ScooperPostSixModel())

  var navArguments: Bundle? = null
}
