package com.chhurngsapplication.app.modules.scooperposttwelve.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperposttwelve.`data`.model.ScooperPostTwelveModel
import org.koin.core.KoinComponent

class ScooperPostTwelveVM : ViewModel(), KoinComponent {
  val scooperPostTwelveModel: MutableLiveData<ScooperPostTwelveModel> =
      MutableLiveData(ScooperPostTwelveModel())

  var navArguments: Bundle? = null
}
