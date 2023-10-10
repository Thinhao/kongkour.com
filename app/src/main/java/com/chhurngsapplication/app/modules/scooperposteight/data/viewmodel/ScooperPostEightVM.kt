package com.chhurngsapplication.app.modules.scooperposteight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperposteight.`data`.model.ScooperPostEightModel
import org.koin.core.KoinComponent

class ScooperPostEightVM : ViewModel(), KoinComponent {
  val scooperPostEightModel: MutableLiveData<ScooperPostEightModel> =
      MutableLiveData(ScooperPostEightModel())

  var navArguments: Bundle? = null
}
