package com.chhurngsapplication.app.modules.scooperpostfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperpostfour.`data`.model.ScooperPostFourModel
import org.koin.core.KoinComponent

class ScooperPostFourVM : ViewModel(), KoinComponent {
  val scooperPostFourModel: MutableLiveData<ScooperPostFourModel> =
      MutableLiveData(ScooperPostFourModel())

  var navArguments: Bundle? = null
}
