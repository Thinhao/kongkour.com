package com.chhurngsapplication.app.modules.scooperpostfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperpostfive.`data`.model.ScooperPostFiveModel
import org.koin.core.KoinComponent

class ScooperPostFiveVM : ViewModel(), KoinComponent {
  val scooperPostFiveModel: MutableLiveData<ScooperPostFiveModel> =
      MutableLiveData(ScooperPostFiveModel())

  var navArguments: Bundle? = null
}
